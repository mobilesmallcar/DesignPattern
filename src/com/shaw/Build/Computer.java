package com.shaw.Build;

public class Computer {
    private String cpu;
    private String ram;//内存
    private String mouse;
    private String keyboard;
    private String display;

    private Computer(Builder builder){
        this.cpu = builder.cpu;
        this.ram = builder.ram;
        this.mouse = builder.mouse;
        this.keyboard = builder.keyboard;
        this.display = builder.display;
    }
    public static class Builder{
        private String cpu;
        private String ram;//
        private String mouse;
        private String keyboard;
        private String display;
        public Builder(String cpu,String ram){
            this.cpu = cpu;
            this.ram = ram;
        }
        public String getMouse(){
            return this.mouse;
        }
        public Builder setMouse(String mouse){
            this.mouse = mouse;
            return this;
        }
        public String getKeyboard() {
            return keyboard;
        }
        public Builder setKeyboard(String keyboard) {
            this.keyboard = keyboard;
            return this;
        }
        public String getDisplay() {
            return display;
        }
        public Builder setDisplay(String display) {
            this.display = display;
            return this;
        }
        public Computer build(){
            return new Computer(this);
        }
    }

    @Override
    public String toString() {
        return "Computer{" +
                "cpu='" + cpu + '\'' +
                ", ram='" + ram + '\'' +
                ", mouse='" + mouse + '\'' +
                ", keyboard='" + keyboard + '\'' +
                ", display='" + display + '\'' +
                '}';
    }
}
