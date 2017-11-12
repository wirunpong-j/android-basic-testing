# Unit Test

## Name Validation

Name Validation คือ การตรวจสอบการใส่ชื่อเข้ามา โดยจะ Test กับ Model ที่ชื่อว่า **"NameValidation.java"** ซึ่งจะแบ่ง Class สำหรับการทำ Name Validation Unit Test  ได้ 2 Class คือ

### 1.) NameValidationFailTest

#### คือ Class ที่เช็คว่ามี Case ใดบ้างที่ใส่ค่า Name เข้ามาแล้ว จะเป็นรูปแบบที่ ผิด บ้าง

- **Case 1 - nameIsEmptyString :** Check ว่า Name ที่รับเข้ามาเป็น String เปล่า ***(Ex. "")***
- **Case 2 - nameIsNull :** Check ว่า Name ที่รับเข้ามาเป็น Null ***(Ex. null)***
- **Case 3 - nameIsLessThanFive :** Check ว่า Name ที่รับเข้ามามีความยาวน้อยกว่า 5 ตัวอักษร ***(Ex. "Bell")***
- **Case 4 - nameIsMoreThanFifteen :** Check ว่า Name ที่รับเข้ามามีความยาวมากกว่า 15 ตัวอักษร ***(Ex. "Bellkungziizanaa")***
- **Case 5 - nameContainNumber :** Check ว่า Name ที่รับเข้ามามีตัวเลขผสมมา ***(Ex. "Bellkung69")***
- **Case 6 - nameContainSpecialCharacter :** Check ว่า Name ที่รับเข้ามามีสัญลักษณ์พิเศษผสมมา (***Ex. "B@#ell!kun^&{}")***
- **Case 7 - nameContainSpace :** Check ว่า Name ที่รับเข้ามามีช่องว่างผสมมา ***(Ex. "Bell kung desu")***
- **Case 8 - firstLetterIsLowerCase :** Check ว่า Name ที่รับเข้ามาตัวอักษรตัวแรกเป็นตัวพิมพ์เล็ก ***(Ex. "bellkung")***
- **Case 9 - secondLetterOnwardsIsUpperCase :** Check ว่า Name ที่รับเข้ามาตังแต่ตัวอักษรที่ 2 เป็นต้นไปเป็นตัวพิมพ์ใหญ่ ***(Ex. "BELlkunG")***

### 2.) NameValidationSuccessTest

#### คือ Class ที่เช็คว่าเมื่อใส่ค่า Name เข้ามาแล้ว จะเป็นรูปแบบที่ ถูกต้อง

**Case normalName :** Check ว่า Name ที่รับเข้ามาจะเป็นเป็นเพียงแค่ชื่อปกติไม่เข้า Case ของ NameValidationFailTest ทุกกรณี ***(Ex. "Bellkung")***



## EmailValidation

Email Validation คือ การตรวจสอบการใส่ Email เข้ามา โดยเราจะใช้ 3rd party library ช่วยในการ Check รูปแบบของ Email ซึ่งก็คือ ***"commons-validator:1.5.1"*** เนื่องจาก Email นั้นมีความเยอะในการ Check โดยจะ Test กับ Model ที่ชื่อว่า **"EmailValidation.java"** ซึ่งจะแบ่ง Class สำหรับการทำ Email Validation Unit Test  ได้ 2 Class คือ

### 1.) EmailValidationFailTest

#### คือ Class ที่เช็คว่ามี Case ใดบ้างที่ใส่ค่า Email เข้ามาแล้ว จะเป็นรูปแบบที่ ผิด บ้าง

- **Case 1 - emailNotContainAtSign :** Check ว่า Email ที่รับเข้ามาไม่มีเครื่องหมาย @ อยู่ ***(Ex. "bell-kunghotmail.com")***
- **Case 2 - emailContaonMoreAtSign :** Check ว่า Email ที่รับเข้ามามีเครื่องหมาย @ มากกว่า 1 ตัว ***(Ex. "bell-kung@@@hotmail.com")***
- **Case 3 - beforeAtSignContainSpecialCharacter :** Check ว่า Email ที่รับเข้ามา ตรงก่อนเครื่องหมาย @ มีสัญลักษณ์พิเศษ ***(Ex. "bell-kung.@hotmail.com")***
- **Case 4 - afterAtSignContainSpecialCharacter :** Check ว่า Email ที่รับเข้ามา ตรงหลังเครื่องหมาย @ มีสัญลักษณ์พิเศษ ***(Ex. "bell-kung@=hotmail.com")***
- **Case 5 - afterDomainNameContainSpecialCharacterWithoutDot :** Check ว่า Email ที่รับเข้ามา ตรงก่อนเครื่องหมาย Dot (.) นั้นมีสัญลักษณ์พิเศษ ***(Ex. "bell-kung@hotmail&.com")***
- **Case 6 - afterDotContainSpecialCharacter :** Check ว่า Email ที่รับเข้ามา ตรงหลังเครื่องหมาย Dot (.) นั้นมีสัญลักษณ์พิเศษ ***(Ex. "bell-kung@hotmail.^com")***
- **Case 7 - userNameContainMoreThanOneDot :** Check ว่า Email ที่รับเข้ามา ตรงส่วน Username นั้นมีเครื่องหมาย Dot (.) มากกว่า 1 ตัว ***(Ex. "be..ll-kung@hotmail.com")***
- **Case 8 - afterDomainNameContainMoreThanOneDot :** Check ว่า Email ที่รับเข้ามา ตรงส่วน Domain Name มีเครื่องหมาย Dot (.) มากกว่า 1 ตัว ***(Ex. "bell-kung@hotmail..com")***
- **Case 9 - domainNameContainSpecialCharacterWithoutDash :** Check ว่า Email ที่รับเข้ามา ตรงส่วน Domain Name มีสัญลักษณ์พิเศษผสมอยู่ ยกเว้นเครื่องหมาย Dash (-) ***(Ex. "bell-kung@hot\*mail.com")***
- **Case 10 - afterDotOnwardsContainNumber :** Check ว่า Email ที่รับเข้ามา ตรงส่วนหลังเครื่องหมาย Dot (.) เป็นต้นไปมีตัวเลขผสมอยู่ ***(Ex. "bell-kung@hotmail.c3om")***
- **Case 11 - afterDotOnwardsContainSpecialCharacter :** Check ว่า Email ที่รับเข้ามา ตรงส่วนหลังเครื่องหมาย Dot (.) เป็นต้นไปมีสัญลักษณ์พิเศษผสมอยู่ ***(Ex. bell-kung@hotmail.c^om%)***
- **Case 12 - afterEmailFormContainSpecialCharacter :** Check ว่า Email ที่รับเข้ามา ตรงสิ้นสุดของบรรทัดเป็นสัญลักษณ์พิเศษ ***(Ex. "bell-kung@hotmail.com$")***
- **Case 13 - afterEmailFormContainNumber :** Check ว่า Email ที่รับเข้ามาตรงสิ้นสุดของบรรทัดเป็นตัวเลข ***(Ex. "bell-kung@hotmail.com3")***


### 2.) EmailValidationSuccessTest

#### คือ Class ที่เช็คว่าเมื่อใส่ค่า Email เข้ามาแล้ว จะเป็นรูปแบบที่ ถูกต้อง

**Case normalEmailForm :** Check ว่า Email ที่รับเข้ามาจะเป็นเป็น Email ปกติ ถูกต้อง และไม่เข้า Case ของ EmailValidationFailTest ทุกกรณี ***(Ex. "bell-kung@hotmail.com")***



# UI Test

### MainActivityUITest

#### เป็น Class ที่ใช้ทำ UI Test ด้วย Espresso โดยเมื่อ Test เสร็จสิ้นจะแสดง Toast ขึ้นมา

- Case 1 - normalNameAndEmail : Check ว่า Name และ Email ที่ใส่เข้ามาต้องถูกรูปแบบของ Unit Test และต้องขึ้น Toast message ว่า ***"Success!!!"***
- Case 2 - fillNameWithoutFillEmail : Check ว่าทำการใส่ Name แต่ไม่ใส่ Email เข้ามาจะต้องขึ้น Toast message ว่า ***"Email is not valid."*** เนื่องจาก Email ไม่ถูกรูปแบบจาก Case ใน Unit Test
- Case 3 - fillEmailWithoutFillName : Check ว่าทำการใส่ Email แต่ไม่ใส่ Name เข้ามาจะต้องขึ้น Toast message ว่า ***"Name is Empty"*** เนื่องจาก Name ไม่ถูกรูปแบบจาก Case ใน Unit Test ใน method ที่ชื่อว่า ***"nameIsEmptyString"***



## FullCoverageReport

![alt text](https://github.com/wirunpong-j/course-android-kmitl/blob/master/lab/lab10/wiki/fullCoverageReport.png?raw=true "FullCoverageReport")
