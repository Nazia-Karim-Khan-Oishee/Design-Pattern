package org.example;

class MaterialwithNotification extends NotificationDecorator {

    public MaterialwithNotification(String materialtype,String title) {
        super(materialtype,title);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " (Notified via Email)";
    }
}



