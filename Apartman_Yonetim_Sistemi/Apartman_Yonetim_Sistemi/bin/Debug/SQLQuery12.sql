use apartman

/****** Object: Table [dbo].[odenen] Script Date: 25.02.2020 01:22:45 ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

CREATE TABLE [dbo].[odenen](
[id] [int] IDENTITY(1,1) NOT NULL,
[odeyen] [nvarchar](50) NULL,
[miktar] [decimal](18, 2) NULL,
[odeme_turu] [nvarchar](50) NULL,
[odeme_onaylayan] [nvarchar](50) NULL,
CONSTRAINT [PK_odenen] PRIMARY KEY CLUSTERED
(
[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]) ON [PRIMARY]

GO