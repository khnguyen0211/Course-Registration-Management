drop database if exists course_registration_management;
create database course_registration_management;
use course_registration_management;
go

create table Students(
	id int IDENTITY(1,1),
	personId varchar(10),
	fullName nvarchar(255),
	birthday date,
	studentAddress nvarchar(255),
	email varchar(255),
	phoneNumber varchar(255),
	studentId varchar(255) not null PRIMARY KEY,
	password varchar(255), 
	studentClass varchar(255),
	major nvarchar(255),
	academicYear varchar(255),
);

INSERT INTO Students (personId, fullName, birthday, studentAddress, email, phoneNumber, studentId, password, studentClass, major, academicYear)
VALUES
('0000000000', N'Phạm Nguyễn Khôi Nguyên', '2002-02-11', N'Dream Home Palace, Q8 , TP.HCM', 'pnkn2002@gmail.com', '0961980167', '52000695', '123456', '20050201', N'Kỹ thuật phần mềm', '2020')
create table Subjects(
	id int IDENTITY(1,1) ,
	subjectId varchar(255) not null PRIMARY KEY,
	subjectName nvarchar(255) not null,
	subjectType nvarchar(255) not null,
	credit int not null
);

create table Registration(
	id int IDENTITY(1,1),
	student_id varchar(255) references Students(studentId),
	subject_id varchar(255) references Subjects(subjectId),
	registrationDate varchar(255) not null,
	isUpdate bit default 0
);
select * from Subjects
select * from Registration where subject_id = '302053'

insert into subjects(subjectId, subjectName, subjectType, credit) 
values 

('302053', N'Pháp luật đại cương', N'Đại cương', 2), 
('306016', N'Tư tưởng Hồ Chí Minh', N'Đại cương', 2),

('501044', N'Cấu trúc rời rạc', N'Cơ sở ngành', 4), 
('502044', N'Tổ chức máy tính', N'Cơ sở ngành', 4),

('502045', N'Công nghệ phần mềm', N'Chuyên ngành', 4), 
('502051', N'Hệ cơ sở dữ liệu', N'Chuyên ngành', 4),

('504058', N'Kiểm thử phần mềm', N'Nhóm tự chọn 1', 3),
('504076', N'Phát triển trò chơi', N'Nhóm tự chọn 1', 3),

('504577', N'Mẫu thiết kế', N'Nhóm tự chọn 2', 3), 
('504644', N'Nhập môn học máy', N'Nhóm tự chọn 2', 3)




INSERT INTO Students (personId, fullName, birthday, studentAddress, email, phoneNumber, studentId, password, studentClass, major, academicYear)
VALUES
('0000000001', N'Nguyễn Thị A', '2000-01-01', N'Quận 1, TP.HCM', 'nguyenthia@gmail.com', '0901234567', '52000001', 'password', 'K60CC', N'Kỹ thuật máy tính', '2020'),
('0000000002', N'Trần Văn B', '2000-02-02', N'Quận 2, TP.HCM', 'tranvanb@gmail.com', '0902345678', '52000002', 'password', 'K61CB', N'Quản lý nhà hàng và dịch vụ ăn uống', '2021'),
('0000000003', N'Lê Thị C', '2000-03-03', N'Quận 3, TP.HCM', 'lethic@gmail.com', '0903456789', '52000003', 'password', 'K60CB', N'Kỹ thuật phần mềm', '2020'),
('0000000004', N'Hoàng Văn D', '2000-04-04', N'Quận 4, TP.HCM', 'hoangvand@gmail.com', '0904567890', '52000004', 'password', 'K61CA', N'Truyền thông đa phương tiện', '2021'),
('0000000005', N'Phạm Thị E', '2000-05-05', N'Quận 5, TP.HCM', 'phamthie@gmail.com', '0905678901', '52000005', 'password', 'K60CC', N'Kỹ thuật cơ khí', '2020'),
('0000000006', N'Nguyễn Văn F', '2000-06-06', N'Quận 6, TP.HCM', 'nguyenvanf@gmail.com', '0906789012', '52000006', 'password', 'K61CB', N'Quản trị nhân lực', '2021'),
('0000000007', N'Trần Thị G', '2000-07-07', N'Quận 7, TP.HCM', 'tranthig@gmail.com', '0907890123', '52000007', 'password', 'K60CB', N'Công nghệ kỹ thuật điện - điện tử', '2020'),
('0000000008', N'Lê Văn H', '2000-08-08', N'Quận 8, TP.HCM', 'levanh@gmail.com', '0908901234', '52000008', 'password', 'K61CA', N'Kinh tế', '2021'),
('0000000009', N'Nguyễn Thị I', '2000-09-09', N'Quận 9, TP.HCM', 'nguyenthii@gmail.com', '0909012345', '52000009', 'password', 'K60CC', N'Kỹ thuật phần mềm', '2020'),
('0000000010', N'Trần Thị K', '2000-10-10', N'Quận 10, TP.HCM', 'tranthik@gmail.com', '0900123456', '52000010', 'password', 'K60CB', N'Thiết kế đồ họa', '2020'),
('0000000011', N'Nguyễn Văn L', '2000-11-11', N'Quận 11, TP.HCM', 'nguyenvanl@gmail.com', '0901234567', '52000011', 'password', 'K61CC', N'Kỹ thuật điện', '2021'),
('0000000012', N'Lê Thị M', '2000-12-12', N'Quận 12, TP.HCM', 'lethim@gmail.com', '0902345678', '52000012', 'password', 'K60CA', N'Kế toán', '2020'),
('0000000013', N'Trần Văn N', '2001-01-01', N'Tân Bình, TP.HCM', 'tranvann@gmail.com', '0903456789', '52000013', 'password', 'K61CB', N'Kinh doanh quốc tế', '2021'),
('0000000014', N'Nguyễn Thị O', '2001-02-02', N'Tân Phú, TP.HCM', 'nguyentho@gmail.com', '0904567890', '52000014', 'password', 'K60CB', N'Kỹ thuật xây dựng', '2020'),
('0000000015', N'Phạm Văn P', '2001-03-03', N'Gò Vấp, TP.HCM', 'phamvanp@gmail.com', '0905678901', '52000015', 'password', 'K61CA', N'Tài chính ngân hàng', '2021'),
('0000000016', N'Trần Thị Q', '2001-04-04', N'Phú Nhuận, TP.HCM', 'tranthiq@gmail.com', '0906789012', '52000016', 'password', 'K60CC', N'Kỹ thuật điều khiển và tự động hóa', '2020'),
('0000000017', N'Nguyễn Văn R', '2001-05-05', N'Thủ Đức, TP.HCM', 'nguyenvanr@gmail.com', '0907890123', '52000017', 'password', 'K61CB', N'Khoa học máy tính', '2021'),
('0000000018', N'Lê Thị S', '2001-06-06', N'Bình Thạnh, TP.HCM', 'lethis@gmail.com', '0908901234', '52000018', 'password', 'K60CB', N'Truyền thông', '2020'),
('0000000019', N'Trần Văn T', '2002-02-11', N'Quận 8, TP.HCM', 'tranvant@gmail.com', '0908901235', '52000019', 'password', 'K62CB', N'Điện - điện tử', '2019'),
('0000000020', N'Nguyễn Thị U', '2001-07-07', N'Quận 7, TP.HCM', 'nguyenthiu@gmail.com', '0909012345', '52000020', 'password', 'K61CB', N'Quản trị kinh doanh', '2021'),
('0000000021', N'Phạm Văn V', '2001-08-08', N'Quận 8, TP.HCM', 'phamvanv@gmail.com', '0910123456', '52000021', 'password', 'K60CA', N'Kế toán', '2020'),
('0000000022', N'Trần Thị X', '2001-09-09', N'Quận 9, TP.HCM', 'tranthix@gmail.com', '0911234567', '52000022', 'password', 'K61CC', N'Kỹ thuật máy tính', '2021'),
('0000000023', N'Nguyễn Văn Y', '2001-10-10', N'Bình Tân, TP.HCM', 'nguyenvany@gmail.com', '0912345678', '52000023', 'password', 'K60CB', N'Thiết kế đồ họa', '2020'),
('0000000024', N'Lê Thị Z', '2001-11-11', N'Thủ Đức, TP.HCM', 'lethiz@gmail.com', '0913456789', '52000024', 'password', 'K61CA', N'Quản trị kinh doanh', '2021'),
('0000000025', N'Trần Văn A1', '2001-12-12', N'Quận 1, TP.HCM', 'tranvana1@gmail.com', '0914567890', '52000025', 'password', 'K60CC', N'Truyền thông', '2020'),
('0000000026', N'Nguyễn Thị B1', '2002-01-01', N'Quận 2, TP.HCM', 'nguyenthib1@gmail.com', '0915678901', '52000026', 'password', 'K61CB', N'Khoa học máy tính', '2021'),
('0000000027', N'Phạm Văn C1', '2002-02-02', N'Quận 3, TP.HCM', 'phamvanc1@gmail.com', '0916789012', '52000027', 'password', 'K60CA', N'Kế toán', '2020'),
('0000000028', N'Trần Thị D1', '2002-03-03', N'Quận 4, TP.HCM', 'tranthid1@gmail.com', '0917890123', '52000028', 'password', 'K61CC', N'Kỹ thuật máy tính', '2021'), 
('0000000029', N'Nguyễn Văn E1', '2002-04-04', N'Quận 5, TP.HCM', 'nguyenvane1@gmail.com', '0918901234', '52000029', 'password', 'K60CB', N'Thiết kế đồ họa', '2020'),
('0000000030', N'Lê Thị F1', '2002-05-05', N'Quận 6, TP.HCM', 'lethif1@gmail.com', '0919012345', '52000030', 'password', 'K61CA', N'Quản trị kinh doanh', '2021'),
('0000000031', N'Trần Văn G1', '2002-06-06', N'Quận 7, TP.HCM', 'tranvang1@gmail.com', '0910123456', '52000031', 'password', 'K60CC', N'Truyền thông', '2020'),
('0000000032', N'Nguyễn Thị H1', '2002-07-07', N'Quận 8, TP.HCM', 'nguyenthih1@gmail.com', '0911234567', '52000032', 'password', 'K61CB', N'Khoa học máy tính', '2021'),
('0000000033', N'Phạm Văn I1', '2002-08-08', N'Quận 9, TP.HCM', 'phamvani1@gmail.com', '0912345678', '52000033', 'password', 'K60CA', N'Kế toán', '2020'),
('0000000034', N'Trần Thị K1', '2002-09-09', N'Thủ Đức, TP.HCM', 'tranthik1@gmail.com', '0913456789', '52000034', 'password', 'K61CC', N'Kỹ thuật máy tính', '2021'),
('0000000035', N'Nguyễn Văn L1', '2002-10-10', N'Quận 1, TP.HCM', 'nguyenvanl1@gmail.com', '0914567890', '52000035', 'password', 'K60CB', N'Thiết kế đồ họa', '2020'),
('0000000036', N'Lê Thị M1', '2002-11-11', N'Quận 2, TP.HCM', 'lethim1@gmail.com', '0915678901', '52000036', 'password', 'K61CA', N'Quản trị kinh doanh', '2021'),
('0000000037', N'Trần Văn N1', '2002-12-12', N'Quận 3, TP.HCM', 'tranvann1@gmail.com', '0916789012', '52000037', 'password', 'K60CC', N'Truyền thông', '2020'),	
('3105553210', 'Tran Dinh Nam', '2002-01-01', '123 Nguyen Van Cu', 'trandinhnam@gmail.com', '0987654321', '52000038', 'password123', 'A1', 'Computer Science', '2021-2022'),
('3105553211', 'Tran Thi Hoa', '2002-02-01', '124 Nguyen Van Cu', 'tranthihoa@gmail.com', '0987654322', '52000039', 'password123', 'A1', 'Computer Science', '2021-2022'),
('3105553212', 'Nguyen Van An', '2002-03-01', '125 Nguyen Van Cu', 'nguyenvanan@gmail.com', '0987654323', '52000040', 'password123', 'A2', 'Marketing', '2021-2022'),
('3105553213', 'Nguyen Van Binh', '2002-04-01', '126 Nguyen Van Cu', 'nguyenvanbinh@gmail.com', '0987654324', '52000041', 'password123', 'A2', 'Marketing', '2021-2022'),
('3105553214', 'Le Thi Lan', '2002-05-01', '127 Nguyen Van Cu', 'lethilan@gmail.com', '0987654325', '52000042', 'password123', 'A3', 'Business Administration', '2021-2022'),
('3105553215', 'Le Van Tuan', '2002-06-01', '128 Nguyen Van Cu', 'levantuan@gmail.com', '0987654326', '52000043', 'password123', 'A3', 'Business Administration', '2021-2022'),
('3105553216', 'Tran Van Cuong', '2002-07-01', '129 Nguyen Van Cu', 'tranvancuong@gmail.com', '0987654327', '52000044', 'password123', 'A4', 'Finance', '2021-2022'),
('3105553217', 'Nguyen Thi Hien', '2002-08-01', '130 Nguyen Van Cu', 'nguyenthihien@gmail.com', '0987654328', '52000045', 'password123', 'A4', 'Finance', '2021-2022'),
('3105553218', 'Pham Van Minh', '2002-09-01', '131 Nguyen Van Cu', 'phamvanminh@gmail.com', '0987654329', '52000046', 'password123', 'A5', 'Human Resources', '2021-2022'),
('3105553219', 'Tran Thi Mai', '2002-10-01', '132 Nguyen Van Cu', 'tranthimai@gmail.com', '0987654330', '52000047', 'password123', 'A5', 'Human Resources', '2021-2022'),
('1910100001', N'Nguyễn Văn A', '2002-01-01', N'Hà Nội', 'nguyenvana@gmail.com', '0987654321', '52000048', 'password123', '12A1', N'Kinh tế', '2022-2023'),
('1910100002', N'Trần Thị B', '2002-02-02', N'Hà Nội', 'tranthib@gmail.com', '0987654322', '52000049', 'password123', '12A2', N'Quản trị kinh doanh', '2022-2023'),
('1910100003', N'Lê Thị C', '2002-03-03', N'Hải Phòng', 'lethic@gmail.com', '0987654323', '52000050', 'password123', '12A3', N'Kế toán', '2022-2023'),
('1910100004', N'Phạm Văn D', '2002-04-04', N'Bắc Giang', 'phamvand@gmail.com', '0987654324', '52000051', 'password123', '12A4', N'Kinh tế', '2022-2023'),
('1910100005', N'Vũ Thị E', '2002-05-05', N'Hải Dương', 'vuthie@gmail.com', '0987654325', '52000052', 'password123', '12A5', 'Marketing', '2022-2023'),
('1910100006', N'Nguyễn Văn F', '2002-06-06', N'Hà Nội', 'nguyenvanf@gmail.com', '0987654326', '52000053', 'password123', '12A6', N'Tài chính - Ngân hàng', '2022-2023'),
('1910100007', N'Trần Thị G', '2002-07-07', N'Hà Nội', 'tranthig@gmail.com', '0987654327', '52000054', 'password123', '12A7', N'Kinh tế', '2022-2023'),
('1910100008', N'Lê Thị H', '2002-08-08', N'Nam Định', 'lethih@gmail.com', '0987654328', '52000055', 'password123', '12A8', N'Quản trị kinh doanh', '2022-2023'),
('1910100009', N'Phạm Văn I', '2002-09-09', N'Hải Phòng', 'phamvani@gmail.com', '0987654329', '52000056', 'password123', '12A9', N'Kế toán', '2022-2023'),
('0010049992', 'Tran Van Tuan', '2002-06-01', '1234 Le Loi, Da Nang', 'tuantran@gmail.com', '0987654321', '52000057', '123456', '12A', 'Computer Science', '2022-2023'),
('0010049982', 'Nguyen Van An', '2001-10-15', '5678 Tran Phu, Ha Noi', 'annguyen@gmail.com', '0123456789', '52000058', '123456', '12A', 'Mathematics', '2022-2023'),
('0010049973', 'Pham Thi Binh', '2003-02-28', '9101 Nguyen Trai, Ho Chi Minh', 'binhpham@gmail.com', '0123456789', '52000059', '123456', '12B', 'Economics', '2022-2023'),
('0041004996', 'Le Van Minh', '2002-05-20', '1112 Tran Hung Dao, Hanoi', 'minhle@gmail.com', '0987654321', '52000060', '123456', '12C', 'Computer Science', '2022-2023'),
('0010054995', 'Hoang Thi Hien', '2001-12-30', '1314 Nguyen Hue, Da Nang', 'hienhoang@gmail.com', '0123456789', '52000061', '123456', '12C', 'Chemistry', '2022-2023'),
('0010045994', 'Doan Van Duc', '2002-09-05', '1516 Phan Dang Luu, HCMC', 'ducdoan@gmail.com', '0987654321', '52000062', '123456', '12A', 'Physics', '2022-2023'),
('0010504993', 'Tran Thi Hong', '2003-04-17', '1718 Le Duan, Hanoi', 'hongtran@gmail.com', '0123456789', '52000063', '123456', '12B', 'Computer Science', '2022-2023'),
('0015004992', 'Nguyen Van Cuong', '2002-07-14', '1920 Tran Hung Dao, Da Nang', 'cuongnguyen@gmail.com', '0123456789', '52000064', '123456', '12A', 'Mathematics', '2022-2023'),
('0010054991', 'Pham Van Khanh', '2001-11-22', '2122 Nguyen Hue, HCMC', 'khanhpham@gmail.com', '0987654321', '52000065', '123456', '12B', 'Chemistry', '2022-2023'),
('0010045990', 'Le Thi Lan', '2002-03-11', '2324 Le Loi, Hanoi', 'lanle@gmail.com', '0123456789', '52000066', '123456', '12C', 'Computer Science', '2022-2023'),
('1254578965', N'Trần Văn Hùng', '2002-03-04', N'123 Nguyễn Trãi, Q1, TP.HCM', 'hungtv@example.com', '0987654321', '52000067', 'password67', '12A1', N'Khoa học máy tính', '2022-2023'),
('3698743125', N'Nguyễn Thị Minh Trang', '2002-05-12', N'456 Lê Lợi, Q2, TP.HCM', 'trangntm@example.com', '0123456789', '52000068', 'password68', '12A2', N'Kinh tế', '2022-2023'),
('7485962321', N'Lê Thị Huyền Trang', '2002-07-20', N'789 Trần Hưng Đạo, Q3, TP.HCM', 'tranglth@example.com', '0987654321', '52000069', 'password69', '12A3', N'Ngôn ngữ Anh', '2022-2023'),
('3214563987', N'Nguyễn Hồng Quang', '2001-09-15', N'111 Điện Biên Phủ, Q4, TP.HCM', 'quangnh@example.com', '0123456789', '52000070', 'password70', '12A4', N'Toán học', '2022-2023'),
('9876543321', N'Trần Thị Hồng Nhung', '2001-12-31', N'222 Hai Bà Trưng, Q5, TP.HCM', 'nhungtth@example.com', '0987654321', '52000071', 'password71', '12A5', N'Hóa học', '2022-2023'),
('6549857123', N'Phạm Thị Thu Thảo', '2001-03-22', N'333 Nguyễn Cư Trinh, Q6, TP.HCM', 'thaopt@example.com', '0123456789', '52000072', 'password72', '12A6', N'Vật lý', '2022-2023'),
('3214768965', N'Lê Đức Thành', '2002-01-11', N'444 Cao Thắng, Q7, TP.HCM', 'thanhlde@example.com', '0987654321', '52000073', 'password73', '12A7', N'Sinh học', '2022-2023'),
('9873215456', N'Nguyễn Thị Minh Ngọc', '2001-04-08', N'555 Đỗ Nhuận, Q8, TP.HCM', 'ngocntm@example.com', '0123456789', '52000074', 'password74', '12A8', N'Khoa học môi trường', '2022-2023'),
('9873214558', N'Nguyễn Thị Thu Ngọc', '2001-06-08', N'559 Đỗ Nhuận, Q9, TP.HCM', 'ngocntm@example.com', '0122456789', '52000075', 'password75', '12A8', N'Khoa học môi trường', '2022-2023'),
('1287652432', N'Trần Văn An', '2002-07-15', N'888 Lê Văn Lương, Q7, TP.HCM', 'antranv@example.com', '0987654321', '52000076', 'password76', '12A2', N'Công nghệ thông tin', '2022-2023'),
('3215476879', N'Phạm Thị Hoa', '2001-03-12', N'123 Nguyễn Văn Linh, Q7, TP.HCM', 'hoapth@example.com', '0369852147', '52000077', 'password77', '12A5', N'Kinh tế', '2022-2023'),
('1234675798', N'Lê Thị Lan', '2002-09-19', N'456 Cao Thắng, Q3, TP.HCM', 'lanlt@example.com', '0584620135', '52000078', 'password78', '12A7', N'Sinh học', '2022-2023'),
('9876954321', N'Ngô Quang Hải', '2001-05-06', N'789 Nguyễn Hữu Thọ, Q7, TP.HCM', 'haihq@example.com', '0123654789', '52000079', 'password79', '12A6', N'Kinh tế', '2022-2023'),
('4561237898', N'Võ Thị Trang', '2002-01-03', N'987 Lê Văn Việt, Q9, TP.HCM', 'trangvt@example.com', '0369874125', '52000080', 'password80', '12A4', N'Tài chính - Ngân hàng', '2022-2023'),
('6549873241', N'Huỳnh Văn Hưng', '2001-08-23', N'456 Đào Duy Anh, Q.Phú Nhuận, TP.HCM', 'hunghv@example.com', '0987456123', '52000081', 'password81', '12A9', N'Lịch sử', '2022-2023'),
('2567890153', N'Trần Thanh Trúc', '2002-02-15', N'254 Lê Văn Việt, Q9, TP.HCM', 'tructt@example.com', '0123456789', '52000082', 'password82', '12A7', N'Tiếng Anh', '2022-2023'),
('1235678391', N'Phạm Ngọc Bích', '2001-07-20', N'56 Nguyễn Văn Thương, Q5, TP.HCM', 'bichpn@example.com', '0123456789', '52000083', 'password83', '12A7', N'Kỹ thuật điện tử', '2022-2023'),
('1987456432', N'Lê Thị Thu Thủy', '2002-10-03', N'14 Lê Thánh Tôn, Q1, TP.HCM', 'thuyltt@example.com', '0123456789', '52000084', 'password84', '12A7', N'Trung tâm tin học', '2022-2023'),
('1765432590', N'Phạm Văn Lâm', '2001-01-25', N'144 Điện Biên Phủ, Q3, TP.HCM', 'lamvp@example.com', '0123456789', '52000085', 'password85', '12A7', N'Kỹ thuật xây dựng', '2022-2023'),
('1346798256', N'Lê Văn Long', '2002-06-12', N'67 Lê Duẩn, Q1, TP.HCM', 'longlv@example.com', '0123456789', '52000086', 'password86', '12A7', N'Trung tâm ngoại ngữ', '2022-2023'),
('1798456329', N'Nguyễn Thị Kim Ngân', '2001-11-05', N'101 Nguyễn Hữu Thọ, Q7, TP.HCM', 'nganntk@example.com', '0123456789', '52000087', 'password87', '12A7', N'Marketing', '2022-2023'),
('1987465307', N'Lê Thị Tú Trinh', '2002-12-31', N'27 Hồ Tùng Mậu, Q1, TP.HCM', 'trinhtt@example.com', '0123456789', '52000088', 'password88', '12A7', N'Quản trị kinh doanh', '2022-2023'),
('1579436282', N'Phạm Văn Minh', '2001-08-13', N'87 Trần Hưng Đạo, Q1, TP.HCM', 'minhpv@example.com', '0123456789', '52000089', 'password89', '12A7', N'Tài chính ngân hàng', '2022-2023'),
('1678901241', N'Trần Thị Thu Trang', '2002-03-27', N'24 Hoàng Diệu, Q4, TP.HCM', 'trangttt@example.com', '0123456789', '52000090', 'password90', '12A7', N'Trung tâm ngoại ngữ', '2022-2023'),
('1678945307', N'Nguyễn Văn An', '2001-12-09', N'16 Lê Văn Thiêm, Q7, TP.HCM', 'anvn@example.com', '0123456789', '52000091', 'password91', '12A7', N'Trung tâm tin học', '2022-2023'),
('1234567898', N'Lê Văn Hưng', '2002-05-18', N'321 Nguyễn Văn Linh, Q7, TP.HCM', 'hunglv@example.com', '0123456789', '52000092', 'password92', '12A7', N'Tiếng Anh', '2022-2023'),
('1956743289', N'Nguyễn Thị Tú Trinh', '2001-09-23', N'456 Lê Lợi, Q1, TP.HCM', 'trinhtt@example.com', '0123456789', '52000093', 'password93', '12A7', N'Marketing', '2022-2023'),
('1987654322', N'Trần Thị Kim Ngân', '2002-01-19', N'678 Lê Quang Định, Q2, TP.HCM', 'nganntk@example.com', '0123456789', '52000094', 'password94', '12A7', N'Kỹ thuật xây dựng', '2022-2023'),
('1567890233', N'Phạm Văn Lâm', '2001-06-05', N'123 Nguyễn Văn Cừ, Q5, TP.HCM', 'lamvp@example.com', '0123456789', '52000095', 'password95', '12A7', N'Quản trị kinh doanh', '2022-2023'),
('1956743202', N'Phạm Ngọc Bích', '2002-11-28', N'89 Đường số 8, Q9, TP.HCM', 'bichpn@example.com', '0123456789', '52000096', 'password96', '12A7', N'Trung tâm ngoại ngữ', '2022-2023'),
('1235678940', N'Nguyễn Văn An', '2001-03-22', N'87 Đường số 10, Q7, TP.HCM', 'anvn@example.com', '0123456789', '52000097', 'password97', '12A7', N'Tài chính ngân hàng', '2022-2023'),
('1987432656', N'Trần Thanh Trúc', '2002-08-02', N'345 Nguyễn Trãi, Q5, TP.HCM', 'tructt@example.com', '0123456789', '52000098', 'password98', '12A7', N'Kỹ thuật điện tử', '2022-2023')



select * from subjects
select * from students
select * from Registration

-- Tạo dữ liệu ngẫu nhiên cho Registration
DECLARE @student_id VARCHAR(255)
DECLARE @subject_id VARCHAR(255)
DECLARE @registrationDate VARCHAR(255)
-- Insert dữ liệu cho mỗi student và subject
DECLARE @i INT = 1
WHILE @i <= 100
BEGIN
    -- Sinh ra các giá trị ngẫu nhiên cho student_id và subject_id
    SET @student_id = '520000' + RIGHT('00' + CAST(@i AS VARCHAR(2)), 2)
    SET @subject_id = (SELECT TOP 1 subjectId FROM Subjects ORDER BY NEWID())

    -- Kiểm tra số lượng sinh viên đã đăng ký cho môn học đó
    IF (SELECT COUNT(*) FROM Registration WHERE subject_id = @subject_id) < 20
    BEGIN
        -- Thực hiện insert dữ liệu vào bảng Registration
        SET @registrationDate = CONVERT(VARCHAR(30), GETDATE(), 121)
        INSERT INTO Registration (student_id, subject_id, registrationDate)
        VALUES (@student_id, @subject_id, @registrationDate)
    EN
    -- Tăng biến đếm lên 1
    SET @i = @i + 1
END
