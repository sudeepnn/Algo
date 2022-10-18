#include <bits/stdc++.h>
using namespace std;

class SegmentTree {
    int v_size, tree_size;
    vector<int> tree;

    int get(int l, int r, int tl, int tr, int node) {
        if(l == tl && r == tr)
            return tree[node];

        int m = (tl + tr) / 2;
        if(r <= m)
            return get(l, r, tl, m, 2 * node);
        else if(l > m)
            return get(l, r, m + 1, tr, 2 * node + 1);
        else
            return max(get(l, m, tl, m, 2 * node), get(m + 1, r, m + 1, tr, 2 * node + 1))
    }

public:
    SegmentTree(const vector<int>& v) {
        tree_size = 1;
        v_size = v.size();
        while(tree_size < v.size())
            tree_size <<= 1;
        tree_size <<= 1;

        tree = vector<int>(tree_size, INT_MIN);
        for(int i = 0; i < v.size(); ++i)
            update(i, v[i]);
    }

    void update(int idx, int val) {
        idx += tree_size / 2;
        tree[idx] = val;

        idx /= 2;
        while(idx) {
            tree[idx] = max(tree[2 * idx], tree[2 * idx + 1]);
            if(tree[idx] > val)
                break;
            idx /= 2;
        }
    }

    int query(int l, int r) {
        return get(l + 1, r + 1, 1, v_size, 1);
    }
};

int main() {
    int n;
    cin >> n;

    vector<int> v(n);
    for(int& t : v)
        cin >> t;

    SegmentTree seg(v);

    while(true) {
        int t;
        cin >> t;

        if(t == 1) {
            int l, r;
            cin >> l >> r;
            cout << (seg.query(l, r)) << "\n";
        }
        else if(t == 2) {
            int idx, val;
            cin >> idx >> val;
            seg.update(idx, val);
        }
        else {
            break;
        }
    }
}