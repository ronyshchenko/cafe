package com.solvd.cafe.patterns.builder;

class Dish {
    private String typeOfDish;
    private String name;
    private int cost;

    private Dish(BuilderDish builderDish) {
        this.typeOfDish = builderDish.typeOfDish;
        this.name = builderDish.name;
        this.cost = builderDish.cost;
    }

    public String getTypeOfDish() {
        return typeOfDish;
    }

    public String getName() {
        return name;
    }

    public int getCost() {
        return cost;
    }

    @Override
    public String toString() {
        return "Dish{" +
                "typeOfDish='" + typeOfDish + '\'' +
                ", name='" + name + '\'' +
                ", cost=" + cost +
                '}';
    }
    static class BuilderDish {
        private String typeOfDish;
        private String name;
        private int cost;

        public BuilderDish(String typeOfDish) {
            this.typeOfDish = typeOfDish;
        }

        public BuilderDish setName(String name) {
            this.name = name;
            return this;
        }

        public BuilderDish setCost(int cost) {
            this.cost = cost;
            return this;
        }

        public Dish build() {
            return new Dish(this);
        }
    }
}