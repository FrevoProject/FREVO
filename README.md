# FREVO

FREVO is an open-source framework developed in Java to help engineers and scientists in evolutionary design or optimization tasks.

The major feature of FREVO is the componentwise decomposition and separation of the key building blocks for each optimization tasks. We identify these as the problem definition, solution representation and the optimization method. This structure enables the components to be designed separately allowing the user to easily swap and evaluate different configurations and methods or to connect an external simulation tool.

FREVO simply stands for FRamework for Evolutionary Design. However, if you look up the word [Frevo in a dictionary](https://en.wikipedia.org/wiki/Frevo), you will see that is also a dance or rather a set of musical styles originating from Brazilian Carnival. The word Frevo is explained as being derived from the Portuguese word ferver which means to boil. This is a nice reference, since our tool FREVO is more or less also boiling the solutions in a pot (ok, rather a pool) until they are ready to serve.

## Modules in the FREVO Archictecture

### Problem definition

This components either encapsulates the simulation tool itself or acts as an interface to an external one. Either way, this component must provide a fitness value to the other components.

### Candidate representation

This component describes the structure of a possible solution. It is used by the optimization method to modify or evolve it and it is evaluated by the problem representation. Currently a a layered and a fully-connected [artificial neural network](https://en.wikipedia.org/wiki/Artificial_neural_network) model is implemented.

### Optimization method

The optimization method is the "heart" of the process. Usually, it creates a pool of possible candidates from the solution representations, evaluates them using the problem definition and uses special techniques to gradually obtain candidates with better performance. Currently, a [Genetic Algorithm](https://en.wikipedia.org/wiki/Genetic_algorithm) has been implemented.

### Ranking algorithm

In most cases, where an absolute fitness can be assigned to each solution this component is not needed. However, in the field of comparative evaluation the tournament algorithm can hold a key function. Currently the following algorithms have been already implemented: [Round-robin tournament](https://en.wikipedia.org/wiki/Round-robin_tournament), [Swiss System tournament](https://en.wikipedia.org/wiki/Swiss-system_tournament).