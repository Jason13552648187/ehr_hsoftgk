package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.att.domain.AttendRecordDetail;
import cn.ibizlab.ehr.webapi.dto.AttendRecordDetailDTO;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-09-04T00:31:56+0800",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_92 (Oracle Corporation)"
)
@Component
public class AttendRecordDetailMappingImpl implements AttendRecordDetailMapping {

    @Override
    public AttendRecordDetail toDomain(AttendRecordDetailDTO dto) {
        if ( dto == null ) {
            return null;
        }

        AttendRecordDetail attendRecordDetail = new AttendRecordDetail();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            attendRecordDetail.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            attendRecordDetail.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getLng() != null ) {
            attendRecordDetail.setLng( dto.getLng() );
        }
        if ( dto.getAttendrecorddetailname() != null ) {
            attendRecordDetail.setAttendrecorddetailname( dto.getAttendrecorddetailname() );
        }
        if ( dto.getSigntime() != null ) {
            attendRecordDetail.setSigntime( dto.getSigntime() );
        }
        if ( dto.getSignlocation() != null ) {
            attendRecordDetail.setSignlocation( dto.getSignlocation() );
        }
        if ( dto.getLat() != null ) {
            attendRecordDetail.setLat( dto.getLat() );
        }
        if ( dto.getAttendancerecordid() != null ) {
            attendRecordDetail.setAttendancerecordid( dto.getAttendancerecordid() );
        }
        if ( dto.getUpdatedate() != null ) {
            attendRecordDetail.setUpdatedate( dto.getUpdatedate() );
        }
        if ( dto.getCreateman() != null ) {
            attendRecordDetail.setCreateman( dto.getCreateman() );
        }
        if ( dto.getCreatedate() != null ) {
            attendRecordDetail.setCreatedate( dto.getCreatedate() );
        }
        if ( dto.getAttendrecorddetailid() != null ) {
            attendRecordDetail.setAttendrecorddetailid( dto.getAttendrecorddetailid() );
        }
        if ( dto.getUpdateman() != null ) {
            attendRecordDetail.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getAttendancerecordname() != null ) {
            attendRecordDetail.setAttendancerecordname( dto.getAttendancerecordname() );
        }

        return attendRecordDetail;
    }

    @Override
    public AttendRecordDetailDTO toDto(AttendRecordDetail entity) {
        if ( entity == null ) {
            return null;
        }

        AttendRecordDetailDTO attendRecordDetailDTO = new AttendRecordDetailDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            attendRecordDetailDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            attendRecordDetailDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getLng() != null ) {
            attendRecordDetailDTO.setLng( entity.getLng() );
        }
        if ( entity.getAttendrecorddetailname() != null ) {
            attendRecordDetailDTO.setAttendrecorddetailname( entity.getAttendrecorddetailname() );
        }
        if ( entity.getSigntime() != null ) {
            attendRecordDetailDTO.setSigntime( entity.getSigntime() );
        }
        if ( entity.getSignlocation() != null ) {
            attendRecordDetailDTO.setSignlocation( entity.getSignlocation() );
        }
        if ( entity.getLat() != null ) {
            attendRecordDetailDTO.setLat( entity.getLat() );
        }
        if ( entity.getAttendancerecordid() != null ) {
            attendRecordDetailDTO.setAttendancerecordid( entity.getAttendancerecordid() );
        }
        if ( entity.getUpdatedate() != null ) {
            attendRecordDetailDTO.setUpdatedate( entity.getUpdatedate() );
        }
        if ( entity.getCreateman() != null ) {
            attendRecordDetailDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getCreatedate() != null ) {
            attendRecordDetailDTO.setCreatedate( entity.getCreatedate() );
        }
        if ( entity.getAttendrecorddetailid() != null ) {
            attendRecordDetailDTO.setAttendrecorddetailid( entity.getAttendrecorddetailid() );
        }
        if ( entity.getUpdateman() != null ) {
            attendRecordDetailDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getAttendancerecordname() != null ) {
            attendRecordDetailDTO.setAttendancerecordname( entity.getAttendancerecordname() );
        }

        return attendRecordDetailDTO;
    }

    @Override
    public List<AttendRecordDetail> toDomain(List<AttendRecordDetailDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<AttendRecordDetail> list = new ArrayList<AttendRecordDetail>( dtoList.size() );
        for ( AttendRecordDetailDTO attendRecordDetailDTO : dtoList ) {
            list.add( toDomain( attendRecordDetailDTO ) );
        }

        return list;
    }

    @Override
    public List<AttendRecordDetailDTO> toDto(List<AttendRecordDetail> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<AttendRecordDetailDTO> list = new ArrayList<AttendRecordDetailDTO>( entityList.size() );
        for ( AttendRecordDetail attendRecordDetail : entityList ) {
            list.add( toDto( attendRecordDetail ) );
        }

        return list;
    }
}
