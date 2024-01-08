package BootCampEx;

abstract class PairMap {
    protected String keyArray[];   // key ���� �����ϴ� �迭
    protected String valueArray[]; // value ���� �����ϴ� �迭

    abstract String get(String key);            // key ���� ���� value ����, ������ null ����
    abstract void put(String key, String value); // key�� value�� ������ ����. ������ key�� ������, ���� value�� ����
    abstract String delete(String key);          // key ���� ���� ������ (value�� �Բ�) ����, ������ value �� ����
    abstract int length();                       // ���� ����� �������� ���� ����
}

class Dictionary extends PairMap {
    public Dictionary(int size) {
        keyArray = new String[size];
        valueArray = new String[size];
    }

    @Override
    String get(String key) {
        for (int i = 0; i < keyArray.length; i++) {
            if (keyArray[i] != null && keyArray[i].equals(key)) {
                return valueArray[i];
            }
        }
        return null;
    }

    @Override
    void put(String key, String value) {
        for (int i = 0; i < keyArray.length; i++) {
            if (keyArray[i] == null || keyArray[i].equals(key)) {
                keyArray[i] = key;
                valueArray[i] = value;
                return;
            }
        }
    }

    @Override
    String delete(String key) {
        for (int i = 0; i < keyArray.length; i++) {
            if (keyArray[i] != null && keyArray[i].equals(key)) {
                String deletedValue = valueArray[i];
                keyArray[i] = null;
                valueArray[i] = null;
                return deletedValue;
            }
        }
        return null;
    }

    @Override
    int length() {
        int count = 0;
        for (String key : keyArray) {
            if (key != null) {
                count++;
            }
        }
        return count;
    }
}

public class DictionaryApp {
    public static void main(String[] args) {
        Dictionary dic = new Dictionary(10);
        dic.put("Ȳ����", "�ڹ�");
        dic.put("���繮", "���̼�");
        dic.put("���繮", "C++"); // ���繮�� ���� C++�� ����
        System.out.println("���繮�� ���� " + dic.get("���繮"));
        System.out.println("Ȳ������ ���� " + dic.get("Ȳ����"));
        dic.delete("Ȳ����"); // Ȳ���� ������ ����
        System.out.println("Ȳ������ ���� " + dic.get("Ȳ����")); // ������ ������ ����
    }
}
