package com.solvd.cafe.patterns.abstractFactoryPattern;

public class AbstractFactoryPattern {

    interface Milk {
        long getMilkPrice();
    }

    interface Water {
        long getWaterPrice();
    }

    interface Tea {
        long getTeaPrice();
    }

    interface InteAbsFactory {
        Milk getMilk();

        Water getWater();

        Tea getTea();
    }

    static class UaMilkImpl implements Milk {

        public long getMilkPrice() {
            return 1000;
        }

    }

    static class UaWaterImpl implements Water {
        public long getWaterPrice() {
            return 3000;
        }
    }

    static class UaTeaImpl implements Tea {
        public long getTeaPrice() {
            return 2000;
        }
    }

    static class UaDrinkPriceAbsFactory implements InteAbsFactory {

        @Override
        public Milk getMilk() {
            return new UaMilkImpl();
        }

        public Water getWater() {
            return new UaWaterImpl();
        }

        public Tea getTea() {
            return new UaTeaImpl();
        }
    }

    static class PLMilkImpl implements Milk {

        public long getMilkPrice() {
            return 10000;
        }
    }

    static class PLWaterImpl implements Water {
        public long getWaterPrice() {
            return 30000;
        }

    }

    static class PLTeaImpl implements Tea {
        public long getTeaPrice() {
            return 20000;
        }
    }

    static class PLDrinkPriceAbsFactory implements InteAbsFactory {

        @Override
        public Milk getMilk() {
            return new PLMilkImpl();
        }

        public Water getWater() {
            return new PLWaterImpl();
        }

        public Tea getTea() {
            return new PLTeaImpl();
        }
    }

}
