Dependencies:
‪ * EMF and XText. Install XText using the update site:
	http://download.itemis.com/updates/releases

Compiling the eclipse plugin for writing .automata files:
 * Open the META-INF/MANIFEST.MF file with Eclipse's plugin manifest editor.
 * Open the Export Wizard and export both soot.typestate.automata and soot.typestate.automata.ui plugins.
Installation:
 * Put the resulting .jar files in Eclipse's plugins or dropins directory.
A pre-compiled version of the .jar files are available in the soot.typestate/lib directory.    