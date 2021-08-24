import java.util.regex.*;
import java.io.*;
import java.util.*;

public class fileIO {

	public static void main(String[] args) {
	//	dirList(args);
	//	Scanner in = new Scanner(System.in);
	//	File fore = new File(in.next());
	//	fore.delete();
		
		if(args.length<1) usage();
		if(args[0].equals("-r")){
			if(args.length!=3) usage();
			File
				old = new File(args[1]),
				rname = new File(args[2]);
		//	boolean awfar = old.delete();
		//	System.out.println("This is it "+awfar);
			old.renameTo(rname);
			fileData(old);
			fileData(rname);
			//rname.deleteOnExit();
			//rname.delete();
			return;//Exit Main
		}
		int count =0;
		boolean del = false;
		if(args[0].equals("-d")){
			count++;
			del=true;
		}
		count--;
		while(++count<args.length){
			File f = new File(args[count]);
			if(f.exists()){
				System.out.println(f+" exists");
				if(del){
					System.out.println("deleting..."+f);
					f.delete();
				}
			}
			else{//doesnt exist
				if(!del){
					f.mkdir();
					System.out.println("Created "+f);
				}
			}
			fileData(f);
		}
	}
	
	private static void usage(){
		System.err.println( 
			"Usage: Class's path1...\n"+
			"Creates each part\n"+
			"Usage: Class's -d path1...\n"+
			"Deletes each path\n"+
			"Usage: Class's -r path1 path2\n"+
			"Renames from path1 to path2"
		);
		System.exit(1);
	}
	
	private static void fileData(File f){
		System.out.println( 
			"Absolute path: "+f.getAbsolutePath()+
			"\nCan read: "+f.canRead()+
			"\nCan write: "+f.canWrite()+
			"\ngetName: "+f.getName()+
			"\ngetParent: "+f.getParent()+
			"\ngetPath: "+f.getPath()+
			"\nLength: "+f.length()+
			"\nlastModified: "+f.lastModified()
		);
		if(f.isFile())
			System.out.println("Its a file");
		else if(f.isDirectory())
			System.out.println("Its a directory");
	}
	
	//: io/DirList.java
	// Display a directory listing using regular expression
	// {Args: "D.*\.java}
	public static void dirList(String[] args){
		File path = new File(".");
		String[] list;
		if(args.length == 0)
			list = path.list();
		else
			list = path.list(new DirFilter(args[0]));
		Arrays.sort(list,String.CASE_INSENSITIVE_ORDER);
		for(String dirItem:list)
			System.out.println(dirItem);
		
	}

}

//CLASS FOR DIRLIST METHOD
class DirFilter implements FilenameFilter{
	private Pattern pattern;
	public DirFilter(String regex){
		pattern = pattern.compile(regex);	
	}
	public boolean accept(File dir,String name){
		return pattern.matcher(name).matches();
	}
}
