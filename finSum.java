public void findSum(TreeNode node, int[] path, int sum, int level) {
  if(node == null) return;
  int t =0;
  path[level] = node.data;
  for(int i=level; i>=0; i--) {
    t = t + path[i];
    if(t == sum) print(path, i, level);
  }
  
  findSum(node.left, path, sum, level+1);
  findSum(node.rigth, path, sum, level+1);
  
  path[level] = Integer.MIN_VALUE;
}

public void findSum(TreeNode n, int sum) {
  int depth = depth(n);
  in[] path = new int[depth];
  findSum(n, path, sum, 0);
}

public int depth(TreeNode n) {
  if(n == null) return 0;
  return 1 + Math.max(depth(n.left), depth(n.right));
}

public static void print(int[] path, int start, int end) {
  for(int i=start; i <= end;i++) {
    System.out.print(path[i]);
  }
}