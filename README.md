# CloudSimulator

## Install guide

### Step 1 - Download and install the Eclipse IDE
1. Download the Eclipse IDE installer from https://www.eclipse.org/downloads/ (version 2019-06 is tested)
2. Install the Eclipse Modeling Tools version from the installer
3. In Eclipse, install Sirius (6.1) from the Eclipse Marketplace, available in the Obeo Marketplace.

### Step 2 - Download and import files
1. Open GIT perspective 
2. Clone the CloudSimulator repository (File => Import, select Git => projects from Git, select Clone Uri)
3. Enter the URL (from Github) in the URI field
4. Clone Git repository and import these existing projects:
    * com.example.load
    * com.example.simulation
    * uu.thesis.emf.metamodel
    * uu.thesis.emf.metamodel.edit
    * uu.thesis.emf.metamodel.editor
    * uu.thesis.softwaresystemarchitecture.sample

### Step 3 - Run Simulation based on sample
1. Unfold the com.example.model.load project 
2. Open loadmodel.java (src -> com.example.model.load)
3. Adjust URI.createURI(“/pathtoGitfolder/git/CloudSimulator/uu.thesis.softwaresystemarchitecture.sample/My.softwaresystemarchitecture”)
4. Unfold the com.example.simulation project
5. Open main.java (src -> com.example.simulation)
6. Run Main (green play button) 
7. Simulation is started and metrics can be read in the console

### Step 4 - Install graphical editor
1. Install the graphical editor (Help => Install New Software…)
2. Click on Add…
    1. Fill in for name: ‘Software System Architecture Editor’
    2. Click on Archive… and select uu.thesis.softwaresystemarchitecture.modeler.zip from the Git repository
3. Select package, click Next > and install the graphical editor (you have to accept the license and approve to install an unsigned program)

### Step 5 - Open graphical editor
1. Unfold the uu.thesis.softwaresystemarchitecture.sample project
2. Open representations.aird file
3. Unfold SoftwareSystem (1) and double click on SoftwareSystem in the representation column
4. The graphical editor will open in a new tab
5. Adjust the model (in the editor) and simulate the deployment based on step 4

### Step 6 - Open graphical editor’ source file for adjusting the graphical editor
1. Run Eclipse Application (green play button), a new Eclipse window will open
2. Click on File => Import, unfold Git folder and select Projects from Git and click Next >
3. Select Existing local repository and click Next >
4. Click on Add… to add the CloudSimulator repository and click Next >
5. Select uu.thesis.softwaresystemarchitecture.design, click Next >, and Finish the import
6. The source file is now ready for use
7. Repeat 1-3 and 5 for uu.thesis.softwaresystemarchitecture.sample
8. Open representations.aird in uu.thesis.softwaresystemarchitecture.sample and double click on SoftwareSystem. There are two Software_Architecture_Description options, select the one with the folder in the icon.

Useful references
* https://wiki.eclipse.org/Sirius/Tutorials/BasicFamily
* https://eclipsesource.com/blogs/tutorials/egit-tutorial/
