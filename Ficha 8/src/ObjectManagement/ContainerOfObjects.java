package ObjectManagement;

public class ContainerOfObjects {

    private final int DEFAULT_SIZE = 100;
    private Object objects[];

    /*
     *
     *
     */
    public ContainerOfObjects(Object[] objects) {
        this.objects = objects;
    }

    /*
     *
     *
     */
    public ContainerOfObjects() {
        objects = new Object[DEFAULT_SIZE];
    }

    /*
     *
     *
     */
    public ContainerOfObjects(int maxSize) {
        objects = new Object[maxSize];
    }

    /*
     *
     *
     */
    protected boolean addObject(Object newObject) {

        for (int i = 0; i < objects.length; i++) {
            if (objects[i] == null) {
                objects[i] = newObject;
                return true;
            }
        }
        return false;
    }


    /*
     *
     *
     */
    protected Object removeObject(int position) {

        Object tmp = objects[position];

        int j;

        for (j = position; j < objects.length - 1 && objects[j] != null; j++) {
            objects[j] = objects[j + 1];
        }
        objects[j] = null;

        return tmp;
    }

    /*
     *
     *
     */
    protected boolean setObject(int position, Object newObject) {
        if (position >= 0 && position < objects.length) {
            if (objects[position] != null) {
                objects[position] = newObject;
                return true;
            }

        }
        return false;
    }

    /*
     *
     *
     */
    protected int findObject(Object obj) {
        for (int i = 0; i < objects.length && objects[i] != null; i++) {
            if (objects[i].equals(obj)) {
                System.out.println("Objeto encontrado!");
                return i;
            }
        }
        System.out.println("Objeto nao encontrado!");
        return -1;
    }

    protected void printall(Object[] objects){
        for(int i = 0; i < objects.length; i++){
            System.out.println(objects[i].toString());
        }
    }

    protected boolean hasObject(Object obj){
        for (int i = 0; i < objects.length && objects[i] != null; i++) {
            if (objects[i].equals(obj)) {
                System.out.println("Objeto Existe!");
                return true;
            }
        }
        System.out.println("Objeto nao existe!");
        return false;
    }





}
