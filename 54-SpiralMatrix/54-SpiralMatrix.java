// Last updated: 12/08/2026, 16:28:54
class Solution {
    public List<Integer> spiralOrder(int[][] arr) {
        List<Integer> ll=new ArrayList<Integer>();

        int row=arr.length;
        int col=arr[0].length;

        int top=0;
        int bot=row-1;
        int left=0;
        int right=col-1;

        int totEl=row*col;
        int cnt=0;

        while(cnt<totEl)
        {

        for(int j=left;j<=right && cnt<totEl;j++)
        {
            ll.add(arr[top][j]);
            cnt++;
        }
        top++;

        for(int i=top;i<=bot  && cnt<totEl;i++)
        {
            ll.add(arr[i][right]);
            cnt++;
        }
        right--;


        for(int j=right;j>=left  && cnt<totEl;j--)
        {
            ll.add(arr[bot][j]);
            cnt++;
        }
        bot--;
        


        for(int i=bot;i>=top  && cnt<totEl;i--)
        {
            ll.add(arr[i][left]);
            cnt++;

        }
        left++;
    }
    return ll;
    
        }
    }
 