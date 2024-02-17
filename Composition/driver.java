package Composition;

public class driver {
    
    public static void main(String[] args)
    {
        //demo1 things
        Folder demo1 = new Folder("demo1");
        Folder sourceFiles = new Folder("Source Files");
        demo1.addFolder(sourceFiles);
        demo1.createFile(".htaccess");
        demo1.createFile(".htRouter.php");
        demo1.createFile("Index.html");

        //sourceFiles things
        Folder phalcon = new Folder(".phalcon");
        Folder app = new Folder("app");
        Folder cache = new Folder("cache");
        Folder publicF = new Folder("Public");
        sourceFiles.addFolder(phalcon);
        sourceFiles.addFolder(app);
        sourceFiles.addFolder(cache);
        sourceFiles.addFolder(publicF);

        //app things
        Folder config = new Folder("Config");
        Folder controllers = new Folder("Controllers");
        Folder library = new Folder("Library");
        Folder migrations = new Folder("Migrations");
        Folder models = new Folder("Models");
        Folder views = new Folder("views");
        app.addFolder(config);
        app.addFolder(controllers);
        app.addFolder(library);
        app.addFolder(migrations);
        app.addFolder(models);
        app.addFolder(views);


        //printouts
        demo1.printStructure("");

        System.out.println("\n\n ---- AFTER DELETING APP --------- \n\n");

        app.delete();
        demo1.printStructure("");

        System.out.println("\n\n ---- AFTER DELETING PUBLIC --------- \n\n");

        publicF.delete();
        demo1.printStructure("");
    }
}
