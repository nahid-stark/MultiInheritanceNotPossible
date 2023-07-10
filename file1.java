/*
here is the problem
if there file1 extends both file2 and file3
and when we called print function from main
then function print does not make decition which i he need to print
file2's i or file3's i
*/
public class file1 extends file3 {// extends file 2
    void print(){
        System.out.println(i);
    }
    
}
