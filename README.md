# TDD_HW1_GroupSums

### 作業位置：http://bit.ly/91-tdd-day1-homework

### 作業規範：
1. 只收 gist 與 GitHub, 強烈建議為 GitHub，因為 day 2 homework 只收 GitHub
2. 作業可以只交 test case，如果你想挑戰 production code 十分歡迎，但請務必先寫好 test case
3. 測試資料請勿使用迴圈產生，因為這資料只是「剛好」長這樣

### 需求：
1. 該11筆資料，如果要3筆成一組，取得Cost的總和的話，預期結果是 6,15, 24, 21
2. 該11筆資料，如果是4筆一組，取得 Revenue 總和的話，預期結果會是 50,66,60
3. 筆數輸入負數，預期會拋 ArgumentException
4. 尋找的欄位若不存在，預期會拋 ArgumentException
5. 筆數若輸入為0, 則傳回0
6. 未來可能會新增其他欄位
7. 希望這個API可以給其他 domain entity 用，例如 Employee
