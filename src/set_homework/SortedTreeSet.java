package set_homework;

public class SortedTreeSet<T extends Comparable<T>> implements Set<T> {
    private class TreeNode {
        private T data;
        private TreeNode left;
        private TreeNode right;

        public TreeNode(T data) {
            this.data = data;
        }
    }

    private TreeNode root;
    private int size;

    public SortedTreeSet() {
        root = null;
        size = 0;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public boolean add(T item) {
        if (item == null) {
            throw new IllegalArgumentException("Item cannot be null");
        }
        if (contains(item)) {
            return false;
        }
        root = addRecursive(root, item);
        size++;
        return true;
    }

    @Override
    public boolean remove(T item) {
        if (item == null) {
            throw new IllegalArgumentException("Item cannot be null");
        }
        if (contains(item)) {
            root = removeRecursive(root, item);
            size--;
            return true;
        }
        return false;
    }

    @Override
    public boolean contains(T item) {
        return containsRecursive(root, item);
    }

    private TreeNode addRecursive(TreeNode root, T item) {
        if (root == null) {
            root = new TreeNode(item);
            return root;
        }
        if (root.data.compareTo(item) > 0) {
            root.left = addRecursive(root.left, item);
        } else if (root.data.compareTo(item) < 0) {
            root.right = addRecursive(root.right, item);
        }
        return root;
    }

    private boolean containsRecursive(TreeNode root, T item) {
        if (root == null) {
            return false;
        }
        if (root.data.equals(item)) {
            return true;
        }
        return root.data.compareTo(item) > 0
                ? containsRecursive(root.left, item)
                : containsRecursive(root.right, item);
    }

    private TreeNode removeRecursive(TreeNode root, T item) {
        if (root.data.compareTo(item) > 0) {
            root.left = removeRecursive(root.left, item);
        } else if (root.data.compareTo(item) < 0) {
            root.right = removeRecursive(root.right, item);
        } else {
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }
            root.data = minValue(root.right);
            root.right = removeRecursive(root.right, root.data);
        }
        return root;
    }

    private T minValue(TreeNode root) {
        T min = root.data;
        while (root.left != null) {
            min = root.left.data;
            root = root.left;
        }
        return min;
    }

    public void print() {
        printRecursive(root);
    }

    private void printRecursive(TreeNode root) {
        if (root != null) {
            printRecursive(root.left);
            System.out.println(root.data);
            printRecursive(root.right);
        }
    }

}

