package com.singtel.insect;

public enum InsectLifecycle {
    EGG {
        @Override
        public void transform() {
            System.out.println("Tranforming to a caterpillar");
        }
    },
    CATERPILLAR {
        @Override
        public void transform() {
            System.out.println("Tranforming to a chrysalis");
        }
    },
    CHRYSALIS {
        @Override
        public void transform() {
            System.out.println("Tranforming to a butterfly");
        }
    },
    BUTTERFLY {
        @Override
        public void transform() {
            System.out.println("Dying");
        }
    };

    public abstract void transform();
}
