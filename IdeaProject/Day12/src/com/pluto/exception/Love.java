package com.pluto.exception;

interface love {
    public abstract void Love();
}


class TeacherTest{
    public static void main(String[] args) {
    new love(){
        @Override
        public void Love() {
            System.out.println("good good study,day day up");
        }
    }.Love();
    }
}
