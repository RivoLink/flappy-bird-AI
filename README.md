# Flappy Bird AI

Python Part Author: Lei Mao

LibGDX Part Author: Rivo Link

## Project Description

[Flappy Bird](https://en.wikipedia.org/wiki/Flappy_bird) is a very popular video game. Here I developed an AI to play Flappy Bird using Deep Q-Learning. 

The AI was able to play Flappy Bird extremely well. It could play the game endlessly without failure, which might be considered "perfect".

![](images/flappy-bird-AI.gif)

## Installation Dependence

### Python

* Python 3.6
* Tensorflow 1.0
* Keras 2.0.3
* Pygame 1.9.3
* OpenCV 2.4.13

### Desktop Java

* Java 7
* Eclipse IDE

### Android

* Java 7
* Eclipse IDE
* Android SDK

## Run AI in Flappy Bird

### Python

The AI needs to be trained before the game. To train the AI, run the command:

    python FlappyBird_AI.py -m train

The AI has already been trained and stored as AI_model.h5 file if you do not want to do the training.

In case of a break during the training, one can resume the training by running the command:

    python FlappyBird_AI.py -m resume

To allow the trained AI to play the game, run the command:

    python FlappyBird_AI.py -m test

#### Desktop Java

Run Eclipse IDE and follow these steps:

* Import projects: **core**,**desktop**
* Open in editor: **desktop/src/.../flappybird/Main.java**
* Run as **Java Application**

#### Android

Under working, please wait for update...

## Disclaimer

The python part of this work was forked from [Lei Mao](https://github.com/leimao) repository on GitHub at:

[https://github.com/leimao/Flappy\\_Bird\\_AI](https://github.com/leimao/Flappy_Bird_AI)
