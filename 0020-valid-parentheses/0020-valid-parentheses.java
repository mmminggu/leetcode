class Solution {
    public boolean isValid(String s) {
        String[] strs = s.split("");
        List<String> list = new ArrayList<>();

        for (int i = 0; i < strs.length; i++) {
            if ("(".equals(strs[i])) {
                list.add(")");
            } else if ("{".equals(strs[i])) {
                list.add("}");
            } else if ("[".equals(strs[i])) {
                list.add("]");
            } else if (list.isEmpty() || !strs[i].equals(list.get(list.size()-1))) {
                return false;
            }else{
                list.remove(list.size() - 1);
            }
        }

        return list.isEmpty();
    }
}