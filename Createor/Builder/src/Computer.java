public class Computer {
    private String Cpu;
    private String Memory;
    private String Disk;
    private String Gpu;

    public Computer(Builder builder ){
        Cpu = builder.Cpu;
        Memory = builder.Memory;
        Disk = builder.Disk;
        Gpu = builder.Gpu;
    }
    public void show() {
        System.out.println("Computer Details: ");
        System.out.println("CPU: " + Cpu);
        System.out.println("RAM: " + Memory);
        System.out.println("Storage: " + Disk);
        System.out.println("Graphics Card: " + Gpu);
    }
    public static class Builder {
        private String Cpu;
        private String Memory;
        private String Disk;
        private String Gpu;

        public Builder serCpu(String cpu){
            Cpu = cpu;
            return this;
        }

        public Builder serMemory(String memory){
            Memory = memory;
            return this;
        }

        public Builder serDisk(String disk){
            Disk = disk;
            return this;
        }

        public Builder serGpu(String gpu){
            Gpu = gpu;
            return this;
        }

        public Computer build(){
            return new Computer(this);
        }
    }

}
