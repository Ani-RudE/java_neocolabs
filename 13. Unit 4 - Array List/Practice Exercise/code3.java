//For Code with a header, footer, just write the below part
List<String> list = new ArrayList<>(); 
		for (int ctr = 0; ctr < number_of_elements; ctr++) {
	        // Input next string
			String str = input. nextLine();
			list.add(str);
		}
		Collections.sort(list, new Comparator<String>() {
			public int compare(String o1, String o2) {
			return o1.length() - o2.length();
		}});
		System.out.println(list);
