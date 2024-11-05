public class Main {
    public static void main(String[] args) {
       Computer computer = new Computer.Builder()
               .serCpu("Intel i9")
               .serMemory("32GB")
               .serDisk("1TB")
               .serGpu("NVIDIA RTX 4060").build();

       computer.show();
    }
}