package leetcode.challange;

import java.util.HashMap;

/**
 * 
 * 
 * Design and implement a data structure for Least Recently Used (LRU) cache. It should support the following operations: get and put.

get(key) - Get the value (will always be positive) of the key if the key exists in the cache, otherwise return -1.
put(key, value) - Set or insert the value if the key is not already present. When the cache reached its capacity, it should invalidate the least recently used item before inserting a new item.

The cache is initialized with a positive capacity.

Follow up:
Could you do both operations in O(1) time complexity?

Example:

LRUCache cache = new LRUCache( 2 /* capacity  );

cache.put(1, 1);
cache.put(2, 2);
cache.get(1);       // returns 1
cache.put(3, 3);    // evicts key 2
cache.get(2);       // returns -1 (not found)
cache.put(4, 4);    // evicts key 1
cache.get(1);       // returns -1 (not found)
cache.get(3);       // returns 3
cache.get(4);       // returns 4
 * @author akshaythakare
 *
 */
public class LRUCache_Day23 
{
	Node_Day23 head;
    Node_Day23 tail;
    HashMap<Integer, Node_Day23> map = null;
    int cap = 0;
 
    public LRUCache_Day23(int capacity) 
    {
        this.cap = capacity;
        this.map = new HashMap<>();
    }
 
    public int get(int key) 
    {
        if(map.get(key)==null)
        {
            return -1;
        }
        //move to tail
        Node_Day23 t = map.get(key);
        removeNode(t);
        offerNode(t);
        return t.value;
    }
 
    public void put(int key, int value) 
    {
        if(map.containsKey(key))
        {
            Node_Day23 t = map.get(key);
            t.value = value;
 
            //move to tail
            removeNode(t);
            offerNode(t);
        }
        else
        {
            if(map.size()>=cap)
            {
                //delete head
                map.remove(head.key);
                removeNode(head);
            }
 
            //add to tail
            Node_Day23 node = new Node_Day23(key, value);
            offerNode(node);
            map.put(key, node);
        }
    }
 
    private void removeNode(Node_Day23 n)
    {
        if(n.prev!=null){
            n.prev.next = n.next;
        }else{
            head = n.next;
        }
 
        if(n.next!=null){
            n.next.prev = n.prev;
        }else{
            tail = n.prev;
        }
    }
 
    private void offerNode(Node_Day23 n)
    {
        if(tail!=null){
            tail.next = n;
        }
 
        n.prev = tail;
        n.next = null;
        tail = n;
 
        if(head == null){
            head = tail;   
        }
    }

}
