package sports.com.service;

import java.util.List;

import sports.com.dto.NoticeDTO;
//aaaa
public interface INoticeService {

	List<NoticeDTO> getNoticeList() throws Exception;
	
	void InsertNoticeInfo(NoticeDTO nDTO) throws Exception;
	
	NoticeDTO getNoticeInfo(NoticeDTO nDTO) throws Exception;
	
	void updateNoticeReadCnt(NoticeDTO nDTO) throws Exception;
	
	void updateNoticeInfo(NoticeDTO nDTO) throws Exception;
	
	void deleteNoticeInfo(NoticeDTO nDTO) throws Exception;

	List<NoticeDTO> getNoticeDetailInfo(NoticeDTO nDTO) throws Exception;
}
