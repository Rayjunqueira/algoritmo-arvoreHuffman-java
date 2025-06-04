import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class HuffmanCoding {

    private Map<Character, String> huffmanCodes = new HashMap<>();

    private HuffmanNode root;


    public void buildTree(String text) {
        Map<Character, Integer> freqMap = new HashMap<>();
        for (char c : text.toCharArray()) {
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
        }

        PriorityQueue<HuffmanNode> pq = new PriorityQueue<>();
        for (Map.Entry<Character, Integer> entry : freqMap.entrySet()) {
            pq.add(new HuffmanNode(entry.getKey(), entry.getValue()));
        }

        while (pq.size() > 1) {
            HuffmanNode left = pq.poll();
            HuffmanNode right = pq.poll();

            HuffmanNode parent = new HuffmanNode('\0', left.frequency + right.frequency);
            parent.left = left;
            parent.right = right;

            pq.add(parent);
        }

        root = pq.poll();

        generateCodes(root, "");
    }

   
    private void generateCodes(HuffmanNode node, String code) {
        if (node == null) {
            return;
        }

        if (node.isLeaf()) {
            huffmanCodes.put(node.character, code);
        }

        generateCodes(node.left, code + "0");
        generateCodes(node.right, code + "1");
    }

    public String encode(String text) {
        StringBuilder encoded = new StringBuilder();
        for (char c : text.toCharArray()) {
            encoded.append(huffmanCodes.get(c));
        }
        return encoded.toString();
    }

    public String decode(String encodedText) {
        StringBuilder decoded = new StringBuilder();
        HuffmanNode current = root;

        for (char bit : encodedText.toCharArray()) {
            current = (bit == '0') ? current.left : current.right;

            if (current.isLeaf()) {
                decoded.append(current.character);
                current = root;
            }
        }

        return decoded.toString();
    }


    public void printCodes() {
        System.out.println("Códigos Huffman:");
        for (Map.Entry<Character, String> entry : huffmanCodes.entrySet()) {
            System.out.println("'" + entry.getKey() + "' : " + entry.getValue());
        }
    }
}
