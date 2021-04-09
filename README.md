# Chain-of-Responsibilty
The goal of the exercise is to implement a simple protocol stack to emulate network communication. 
It will have 4 layers, each of which transform or append to the message:
• Application layer – constructs a message (a String)
• Encryption layer - scrambles the message (see next slide)
• TCP layer – adds a simple string header (some prefix string)
• Ethernet layer – adds a simple string header (some other prefix string)
