package trees;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

import org.w3c.dom.Node;

public class levelorderreverse {
    class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}
        public ArrayList<Integer> reverseLevelOrder(Node root) {
            ArrayList<Integer> result = new ArrayList<>();

            Queue<Node> q = new LinkedList<>();
            q.offer(root);
            while(!q.isEmpty()){
                Node current = q.poll();
                result.add(current.data);
                if(current.right!=null) q.offer(current.right);
                if(current.left!=null) q.offer(current.left);


            }
            Collections.reverse(result);
            return result;
        }
}
