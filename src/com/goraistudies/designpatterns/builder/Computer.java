package com.goraistudies.designpatterns.builder;

public class Computer {

    private String RAM;
    private String HDD;
    private String motherBoard;
    private String graphicsCard;
    private String SSD;
    private String DvdWriter;

    public String getRAM() {
        return RAM;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "RAM='" + RAM + '\'' +
                ", HDD='" + HDD + '\'' +
                ", motherBoard='" + motherBoard + '\'' +
                ", graphicsCard='" + graphicsCard + '\'' +
                ", SSD='" + SSD + '\'' +
                ", DvdWriter='" + DvdWriter + '\'' +
                '}';
    }

    public String getHDD() {
        return HDD;
    }

    public String getMotherBoard() {
        return motherBoard;
    }

    public String getGraphicsCard() {
        return graphicsCard;
    }

    public String getSSD() {
        return SSD;
    }

    public String getDvdWriter() {
        return DvdWriter;
    }

    private Computer(ComputerBuilder computerBuilder){
        this.graphicsCard = computerBuilder.graphicsCard;
        this.HDD = computerBuilder.HDD;
        this.SSD = computerBuilder.SSD;
        this.motherBoard = computerBuilder.motherBoard;
        this.RAM = computerBuilder.RAM;
        this.DvdWriter = computerBuilder.DvdWriter;

    }

    static class ComputerBuilder {

        private String RAM;
        private String HDD;
        private String motherBoard;
        private String graphicsCard;
        private String SSD;
        private String DvdWriter;

        public ComputerBuilder setRAM(String RAM) {
            this.RAM = RAM;
            return this;
        }

        public ComputerBuilder setHDD(String HDD) {
            this.HDD = HDD;
            return this;
        }

        public ComputerBuilder setMotherBoard(String motherBoard) {
            this.motherBoard = motherBoard;
            return this;
        }

        public ComputerBuilder setGraphicsCard(String graphicsCard) {
            this.graphicsCard = graphicsCard;
            return this;
        }

        public ComputerBuilder setSSD(String SSD) {
            this.SSD = SSD;
            return this;
        }

        public ComputerBuilder setDvdWriter(String dvdWriter) {
            DvdWriter = dvdWriter;
            return this;
        }

        public ComputerBuilder() {

        }

        public Computer build() {
            Computer computer = new Computer(this);
            return computer;
        }
    }


}
