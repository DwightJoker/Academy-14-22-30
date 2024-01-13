package by.academy.lessons1to15.lesson11.task;

public enum Season {
    SPRING(15){
        public void getDescription() {
            System.out.println(" Теплое время года");
        }
    },
    SUMMER(30) {
        public void getDescription() {
            System.out.println(" Жаркое время года");
        }
    },
    AUTUMN(5),
    WINTER(-15){
        public void getDescription() {
            System.out.println(" Очень холодное время года");
        }
    };
    private double temperature;

    Season(double temperature) {
        this.temperature = temperature;
    }



    public double getTemperature() {
        return temperature;
    }

    public void getDescription() {
        System.out.println(" Холодное время года");
    }


}

