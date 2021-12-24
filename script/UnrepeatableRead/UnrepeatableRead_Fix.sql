﻿---XEM SỐ LƯỢNG TỒN CỦA SẢN PHẨM
-- DROP PROC SP_XEMSLTON
-- DROP PROC SP_CAPNHATSLTON

CREATE PROC SP_XEMSLTON
	@MADT CHAR(10),
	@MACN CHAR(10),
	@MASP CHAR(10)
AS
BEGIN TRAN
	SET TRAN ISOLATION LEVEL REPEATABLE READ
	BEGIN TRY
		IF NOT EXISTS (SELECT * FROM CHINHANH_SANPHAM WHERE MADT = @MADT)
		BEGIN
			PRINT  @MADT + N' KHÔNG TỒN TẠI'
			ROLLBACK TRAN
			RETURN 1
		END

		IF NOT EXISTS (SELECT * FROM CHINHANH_SANPHAM WHERE MACN = @MACN)
		BEGIN
			PRINT  @MACN + N' KHÔNG TỒN TẠI'
			ROLLBACK TRAN
			RETURN 1
		END

		IF NOT EXISTS (SELECT * FROM CHINHANH_SANPHAM WHERE MASP = @MASP)
		BEGIN
			PRINT  @MASP + N' KHÔNG TỒN TẠI'
			ROLLBACK TRAN
			RETURN 1
		END
		
		SELECT SOLUONGTON FROM CHINHANH_SANPHAM WHERE MADT=@MADT AND MACN = @MACN AND MASP=@MASP
			WAITFOR DELAY '00:00:05'

		SELECT SOLUONGTON FROM CHINHANH_SANPHAM WHERE MADT=@MADT AND MACN = @MACN AND MASP=@MASP

		END TRY
			BEGIN CATCH
		PRINT N'LỖI HỆ THỐNG'
		ROLLBACK TRAN
		RETURN 1
	END CATCH
COMMIT TRAN
RETURN 0
GO

---CẬP NHẬT SỐ LƯỢNG TỒN CỦA SẢN PHẨM
CREATE PROC SP_CAPNHATSLTON
	@MADT CHAR(10),
	@MACN CHAR(10),
	@MASP CHAR(10), 
	@SOLUONG INT
AS
BEGIN TRAN
	BEGIN TRY
		IF NOT EXISTS (SELECT * FROM CHINHANH_SANPHAM WHERE MADT = @MADT)
		BEGIN
			PRINT  @MADT + N' KHÔNG TỒN TẠI'
			ROLLBACK TRAN
			RETURN 1
		END

		IF NOT EXISTS (SELECT * FROM CHINHANH_SANPHAM WHERE MACN = @MACN)
		BEGIN
			PRINT  @MACN + N' KHÔNG TỒN TẠI'
			ROLLBACK TRAN
			RETURN 1
		END

		IF NOT EXISTS (SELECT * FROM CHINHANH_SANPHAM WHERE MASP = @MASP)
		BEGIN
			PRINT  @MASP + N' KHÔNG TỒN TẠI'
			ROLLBACK TRAN
			RETURN 1
		END
		
		UPDATE CHINHANH_SANPHAM
		SET SOLUONGTON = SOLUONGTON + @SOLUONG
		WHERE MADT = @MADT AND MACN = @MACN AND MASP = @MASP

		END TRY
			BEGIN CATCH
		PRINT N'LỖI HỆ THỐNG'
		ROLLBACK TRAN
		RETURN 1
	END CATCH
COMMIT TRAN
RETURN 0
