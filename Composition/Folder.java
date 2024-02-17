package Composition;

import java.util.ArrayList;

public class Folder {
    
    public Folder parentFolder;
    public String folderName;
    public ArrayList<Folder> subFolders;
    public ArrayList<File> files;

    public Folder(String folderName) {
        this.folderName = folderName;
        subFolders = new ArrayList<>();
        files = new ArrayList<>();
        parentFolder = null;
    }

    public void addFolder(Folder folder)
    {
        folder.setParentFolder(this);
        subFolders.add(folder);
    }

    public void createFile(String fileName)
    {
        File file = new File(fileName);
        files.add(file);
    }

    public void setParentFolder(Folder folder)
    {
        parentFolder = folder;
    }

    public ArrayList<Folder> getSubFolders()
    {
        return subFolders;
    }

    public ArrayList<File> getFiles()
    {
        return files;
    }

    public Folder getParentFolder()
    {
        return parentFolder;
    }

    public void delete()
    {

        for (int i = 0; i < parentFolder.getSubFolders().size(); i++)
        {
            if (parentFolder.getSubFolders().get(i).equals(this))
            {
                parentFolder.getSubFolders().remove(i);
                break;
            }
        }
    
    }

    public void setFolderName(String folderName)
    {
        this.folderName = folderName;
    }

    public String getFolderName()
    {
        return folderName;
    }

    public void printStructure(String indent)
    {
        System.out.println(indent + folderName);
        for (Folder folder : subFolders) {
            folder.printStructure(indent + "\t");
        }
        for (File file : files) {
            System.out.println(indent + "\t" + file.getFileName());
        }
    }

    private class File {
        private String fileName;
    
        public File(String fileName2) {
            this.fileName = fileName2;
        }

        public String getFileName() {
            return fileName;
        }
    
        public void setFileName(String fileName) {
            this.fileName = fileName;
        }

        public void delete()
        {
    
            for (int i = 0; i < parentFolder.getFiles().size(); i++)
            {
                if (parentFolder.getFiles().get(i).equals(this))
                {
                    parentFolder.getFiles().remove(i);
                    break;
                }
            }
        
        }
    }
    
}
