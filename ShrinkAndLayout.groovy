import javax.swing.JFileChooser

// code here

JFileChooser f = new JFileChooser();
f.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
f.showSaveDialog(new File(System.getProperty("user.home")+"/Downloads/"));

double scale = 0.25

def dir = f.getSelectedFile()
System.out.println(dir);

File[] listOfFiles = dir.listFiles();

println listOfFiles