package graphics;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;

import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.RuleReturnScope;
import org.antlr.stringtemplate.StringTemplateGroup;
import org.antlr.stringtemplate.language.AngleBracketTemplateLexer;

import core.AbstractRepresentation;
import helper.CMinusLexer;
import helper.CMinusParser;

public class ExportFrame extends JFrame {

	
	public ExportFrame(AbstractRepresentation representation) {
		super(representation.getXMLData().getClassName() + " ("
				+ representation.getHash() + ")");
		
		setBounds(0, 0, 500, 500);
		setLayout(new GridLayout(3,1));
		JButton btnC=new JButton("C");
		btnC.addActionListener(new ActionListener()
		{
			  public void actionPerformed(ActionEvent e)
			  {
				try {
					String content=representation.getC();
			    	if (content==null){
			    		CloseFrame();
			    		return;
			    	}
			    	String name=ExportFrame.getSavePlace();
			    	CloseFrame();
			    	content=getCPreamble()+content;
			    	PrintWriter	out = new PrintWriter(name);
					out.print(content);
				    out.close();
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}		    
			  }
			});
		add(btnC);
		for (String language:this.getLanguages()){
			JButton btn=new JButton(language);
			btn.addActionListener(new ActionListener()
			{
				  public void actionPerformed(ActionEvent e)
				  {
				    String stgName=((JButton)e.getSource()).getText()+".stg";
					PrintWriter out;
					try {
						StringTemplateGroup templates = new StringTemplateGroup(new FileReader(stgName),
							    AngleBracketTemplateLexer.class);
					    String content=representation.getC();
					    if (content==null){
					    	CloseFrame();
					    	return;
					    }
					    InputStream stream = new ByteArrayInputStream(content.getBytes(StandardCharsets.UTF_8));
					    CMinusLexer lexer = new CMinusLexer(new ANTLRInputStream(stream));
						CommonTokenStream tokens = new CommonTokenStream(lexer);
						CMinusParser parser = new CMinusParser(tokens);
						parser.setTemplateLib(templates);
						RuleReturnScope r = parser.program();
						String result=r.getTemplate().toString();
						String name=ExportFrame.getSavePlace();
						out = new PrintWriter(name);
						out.print(result);
					    out.close();
					} catch (FileNotFoundException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} catch (RecognitionException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					CloseFrame();
				  }
				});
			add(btn);
		}
	}
	
	public void CloseFrame(){
	    super.dispose();
	}
	
	private List<String> getLanguages(){
		List<String> results=new ArrayList<String>();
		File[] files = new File(".").listFiles();
		for (File file : files) {
		    if (file.isFile() && file.getName().endsWith(".stg")) {
		        results.add(file.getName().split("\\.")[0]);
		    }
		}
		return results;
	}
	
	public static String getSavePlace(){
		JFileChooser c = new JFileChooser();
	      // Demonstrate "Open" dialog:
	      int rVal = c.showSaveDialog(null);
	      if (rVal == JFileChooser.APPROVE_OPTION) {
	        return c.getSelectedFile().getAbsolutePath();
	      }
	      else{
	    	  return null;
	      }
	}
	
	private String getCPreamble(){
		String activate="#include <math.h>\n\nclass Result{\npublic:\n  float output[];\n  Result(float outp[], long outputsize){\n    long i;\n	for (i=0L;i<outputsize; i=i+1){\n	  output[i]=outp[i];\n	}\n  }\n};\n\n";
		return activate;
	}

}
