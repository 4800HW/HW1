package Composition;

import java.util.ArrayList;

public class Folder {
    
    public String folderName;
    public ArrayList<Folder> subFolders;
    public ArrayList<File> files;

    public Folder(String folderName) {
        this.folderName = folderName;
        subFolders = new ArrayList<>();
        files = new ArrayList<>();
    }

    public void addFolder(Folder folder)
    {
        subFolders.add(folder);
    }

    public void createFile(String fileName)
    {
        File file = new File(fileName);
        files.add(file);
    }

    public void delete(Object object)
    {
        if (object instanceof Folder)
        {
            for (int i = 0; i < subFolders.size(); i++)
            {
                if (subFolders.get(i).equals(object))
                {
                    subFolders.remove(i);
                    break;
                }
            }
        }

        if (object instanceof File)
        {
            for (int i = 0; i < files.size(); i++)
            {
                if (files.get(i).equals(object))
                {
                    files.remove(i);
                    break;
                }
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
    }
    
}
