package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.soc.domain.SocRecord;
import cn.ibizlab.ehr.webapi.dto.SocRecordDTO;
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
    date = "2021-09-04T00:31:53+0800",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_92 (Oracle Corporation)"
)
@Component
public class SocRecordMappingImpl implements SocRecordMapping {

    @Override
    public SocRecord toDomain(SocRecordDTO dto) {
        if ( dto == null ) {
            return null;
        }

        SocRecord socRecord = new SocRecord();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            socRecord.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            socRecord.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getSocrecordname() != null ) {
            socRecord.setSocrecordname( dto.getSocrecordname() );
        }
        if ( dto.getSocrecordid() != null ) {
            socRecord.setSocrecordid( dto.getSocrecordid() );
        }
        if ( dto.getCreateman() != null ) {
            socRecord.setCreateman( dto.getCreateman() );
        }
        if ( dto.getCreatedate() != null ) {
            socRecord.setCreatedate( dto.getCreatedate() );
        }
        if ( dto.getUpdateman() != null ) {
            socRecord.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getUpdatedate() != null ) {
            socRecord.setUpdatedate( dto.getUpdatedate() );
        }

        return socRecord;
    }

    @Override
    public SocRecordDTO toDto(SocRecord entity) {
        if ( entity == null ) {
            return null;
        }

        SocRecordDTO socRecordDTO = new SocRecordDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            socRecordDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            socRecordDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getSocrecordname() != null ) {
            socRecordDTO.setSocrecordname( entity.getSocrecordname() );
        }
        if ( entity.getSocrecordid() != null ) {
            socRecordDTO.setSocrecordid( entity.getSocrecordid() );
        }
        if ( entity.getCreateman() != null ) {
            socRecordDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getCreatedate() != null ) {
            socRecordDTO.setCreatedate( entity.getCreatedate() );
        }
        if ( entity.getUpdateman() != null ) {
            socRecordDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getUpdatedate() != null ) {
            socRecordDTO.setUpdatedate( entity.getUpdatedate() );
        }

        return socRecordDTO;
    }

    @Override
    public List<SocRecord> toDomain(List<SocRecordDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<SocRecord> list = new ArrayList<SocRecord>( dtoList.size() );
        for ( SocRecordDTO socRecordDTO : dtoList ) {
            list.add( toDomain( socRecordDTO ) );
        }

        return list;
    }

    @Override
    public List<SocRecordDTO> toDto(List<SocRecord> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<SocRecordDTO> list = new ArrayList<SocRecordDTO>( entityList.size() );
        for ( SocRecord socRecord : entityList ) {
            list.add( toDto( socRecord ) );
        }

        return list;
    }
}
