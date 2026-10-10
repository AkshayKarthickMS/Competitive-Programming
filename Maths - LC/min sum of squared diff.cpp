        priority_queue<pair<int, int>> max_pq;
        long long k = k1 + k2;

        for(int i = 0; i < nums1.size(); i++){
            max_pq.push({abs(nums1[i] - nums2[i]), i});
        }

        while(k != 0){
            pair<int, int> top_elt = max_pq.top();
            long long diff = top_elt.first;
            int idx = top_elt.second;
            if (diff == 0) break;
            if(k) k--;
            max_pq.pop();
            max_pq.push({diff-1, idx});
        }
        long long res = 0;
        while(!max_pq.empty()){
            pair<int, int> top_elt = max_pq.top();
            long long diff = top_elt.first;
            int idx = top_elt.second;
            res = res + (diff * diff);
            max_pq.pop();            
        }
        return res;