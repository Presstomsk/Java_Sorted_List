# Java_Sorted_List
 Не используя сортировку, написать метод который возвращает 3ий list в отсортированном виде
 
 List<Integer> list1 = new ArrayList<>(){};
        list1.add(1);
        list1.add(5);
        list1.add(10);
        list1.add(12);
        list1.add(15);
        list1.add(20);
        list1.add(21);
        list1.add(22);

        List<Integer> list2 = new ArrayList<>(){};
        list2.add(-5);
        list2.add(-1);
        list2.add(9);
        list2.add(15);
        list2.add(100);
//-5,-1,1,5,9,10,12,15,15,20,21,22,100
        System.out.println(list1);
