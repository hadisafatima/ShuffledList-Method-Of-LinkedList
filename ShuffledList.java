public static Elements shuffledList(Elements start) {
        if (start == null || start.next == null) {
            return start;
        }

        Random random = new Random();
        int length = 0;
        Elements current = start;
        while (current != null) {
            length++;
            current = current.next;
        }

//        Shuffling with Fisher-Yates Algorithm
        for (int i = 0; i < length ; i++) {
            int j = random.nextInt(length - i) ; // 3
            Elements node1 = getNodeAtIndex(i, start);
            Elements node2 = getNodeAtIndex(j, start);

            int temp = node1.data;
            node1.data = node2.data;
            node2.data = temp;
        }
        return start;
    }

    public static Elements getNodeAtIndex(int index, Elements start) {
        Elements current = start;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current;
    }
