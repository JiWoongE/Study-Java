package BootCampEx;

abstract class PairMap {
    protected String keyArray[];   // key 들을 저장하는 배열
    protected String valueArray[]; // value 들을 저장하는 배열

    abstract String get(String key);            // key 값을 가진 value 리턴, 없으면 null 리턴
    abstract void put(String key, String value); // key와 value를 쌍으로 저장. 기존에 key가 있으면, 값을 value로 수정
    abstract String delete(String key);          // key 값을 가진 아이템 (value와 함께) 삭제, 삭제된 value 값 리턴
    abstract int length();                       // 현재 저장된 아이템의 개수 리턴
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
        dic.put("황기태", "자바");
        dic.put("이재문", "파이선");
        dic.put("이재문", "C++"); // 이재문의 값을 C++로 수정
        System.out.println("이재문의 값은 " + dic.get("이재문"));
        System.out.println("황기태의 값은 " + dic.get("황기태"));
        dic.delete("황기태"); // 황기태 아이템 삭제
        System.out.println("황기태의 값은 " + dic.get("황기태")); // 삭제된 아이템 접근
    }
}
