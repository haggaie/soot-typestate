*******************************
* Typestate analysis for Soot *
*******************************

Running
*******
The project is submitted with compiled binaries in the bin/ dir.
In order to run the analysis on the examples in the examples/ dir, run
the scripts in the scripts/ dir:
	scripts/test-stack.sh
	scripts/test-file.sh
	scripts/test-socket.sh

These scripts use the ant file build.xml to run.

Example Files
*************
The automata files and the code they try to verify are in the examples/ dir. 

The following paragraphs are only for general knowledge, and not required in
order to run the project.

Building
********
We used XText to create a parser for automata description files. You can 
download it to eclipse using the update site:
	http://download.itemis.com/updates/releases
We've put the required runtime files in the lib/eclipse dir, so you should be
able to build the project even without installing these plugins. 

The XText based parser itself is located in the lib/plugins/soot.typestate.automata* 
files. Inside the .jar files you can also find the source grammar.

You can install the plugins in eclipse by putting the above .jar files in 
Eclipse's dropins directory, for having an XText based editor for the automata 
files.

For the submission completeness, we've put the soot version we used in the lib/ 
dir.
