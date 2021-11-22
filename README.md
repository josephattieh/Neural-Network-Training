- Joseph Attieh
- Clara Akiki

# Neural-Network-Training

_Submitted on Oct 2018 for COE 544 - Intelligent Engineering Algorithms_

## Requirements 
This project aims to build a multilayer neural network from scratch that can take multiple inputs in parallel and produce their outputs. Once the network has been structured, it is ready to be trained using a data set. During training, the error between the output computed by the network and the desired output will propagate through the network causing the system to adjust its weights. Finally, the system can be tested by entering inputs and checking the outputs.

The flow of the application is described as follows:
- First, the user designs the network by choosing the number of inputs, number of outputs, number of hidden layers, number of neurons per hidden layer of the artificial neural network as well as the weights, the activation function and the threshold of each neuron in that network.
- Second, this multilayer network is trained by providing both inputs and desired outputs. The system will perform backpropagation and update the weights of each neuron. 
- Third, the neural network can also be tested by entering the inputs and the desired outputs then the system will cal-culate the error between the output computed from the network and the desired output. 


This whole project is to be coded in JAVA and  be visualized graphically with a GUI interface that will mainly allow the user to build a multilayer neurons and choose all its characteristics, train it and test it.


## Functionalities 
The main functionalities offered by the system are the following:
1.	Choosing the number of inputs, outputs, layers and neurons in each layer.
2.	Choosing the weights, activation function and threshold for each neuron.
3.	Choosing the error calculation method and the maximum number of iterations.
4.	Editing the activation function and threshold for a group of neurons.
5.	Importing a .txt file containing the inputs and their desired outputs for training.
6.	Validating the network by choosing one of the three validation methods: separate validation, K-fold cross-validation and Monte Carlo cross-validation.
7.	Allowing user to enter inputs and test their output.

## Experimental Additional Features
- Drop unused data:  After testing our neural network, we realized that some values cannot be learned by this network since the design process requires a lot of fine tuning and a lot of decision making. Those “unlearnable” values will consume all the iterations (where the output is compared to the desirable output) and thus will ruin the weights of the connections. This will damage the ability of the network to give a correct output for the learned data. To fix this, our implementa-tion checks if the input-desirable pair can be learned by the network. If it cannot be learned, the neural network re-covers to the state just before trying to learn those data pairs. This approach made the neural network more efficient and enabled us to disregard a training pair that might ruin the knowledge of our network.

- Edit a group of neurons: The user of the neural network might be dealing with a lot of neurons and a lot of layers. It becomes impractical for the user to change the parameters of each neuron. To solve this issue, the user was provided with the ability to select the neurons that he/she needs to edit and set the parameters with minimal effort.

-  Validations algorithms: As discussed before, three algorithms were implemented: the separation validation, k-fold cross validation and the Monte Carlo cross-validation.  Those algorithms were implemented in a way that gives the user full control of the neural network. In the separate validation, the user could select the percentage of pairs that he/she need to use for training. In the K-fold cross-validation, the user has the choice to choose the number of subsets that need to hold the data pairs. For the Monte Carlo cross-validation, the user is provided with the choice to set the number of iterations in which the divison into random sets happen. 
With this amount of flexibility, the user could observe if all the training data can be learned by the agents. This process can be done by uploading the file containing the training data and by running those three algorithms until the ratio visualized is maximized in the three of those algorithms. This ratio represents the ratio between the number of training pairs that were learned by the network over the number of the whole training pairs. This is an efficient way to train the neural network easily without having to worry that much about the order of data and memory losss.   

- Training Set Validation: A user might by mistake, choose the wrong data set for the network. To solve this problem, the user is warned by a popup that using this data set with the current neural network is not allowed. This prevents the user from ruining his/her neural network.
