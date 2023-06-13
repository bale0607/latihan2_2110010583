
package universitas;


public class mahasiswaberaksi {
    public static void main(String[] args) {
        mahasiswa anam = new mahasiswa ();
        anam.setprodi("teknik informatika");
        anam.setnpm("211010583");
        anam.setnama("iqbal nurrahmad pratama");
        
        
        System.out.println("npm :" +anam.getnpm());
        System.out.println("nama :" +anam.getnama());
        System.out.println("kelas :" +anam.getprodi());
        
    }
    
}  


 

