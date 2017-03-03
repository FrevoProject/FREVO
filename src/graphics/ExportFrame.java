package graphics;

import javax.swing.JFrame;

import core.AbstractRepresentation;

public class ExportFrame extends JFrame {

	public ExportFrame(AbstractRepresentation representation) {
		super(representation.getXMLData().getClassName() + " ("
				+ representation.getHash() + ")");
		
		setBounds(0, 0, 500, 500);
		String name=representation.getHash();
		
	}

}
