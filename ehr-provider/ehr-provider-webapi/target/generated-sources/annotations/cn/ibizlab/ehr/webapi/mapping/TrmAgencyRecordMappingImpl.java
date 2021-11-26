package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.trm.domain.TrmAgencyRecord;
import cn.ibizlab.ehr.webapi.dto.TrmAgencyRecordDTO;
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
    date = "2021-09-04T00:31:55+0800",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_92 (Oracle Corporation)"
)
@Component
public class TrmAgencyRecordMappingImpl implements TrmAgencyRecordMapping {

    @Override
    public TrmAgencyRecord toDomain(TrmAgencyRecordDTO dto) {
        if ( dto == null ) {
            return null;
        }

        TrmAgencyRecord trmAgencyRecord = new TrmAgencyRecord();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            trmAgencyRecord.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            trmAgencyRecord.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getPxcs() != null ) {
            trmAgencyRecord.setPxcs( dto.getPxcs() );
        }
        if ( dto.getPxzsc() != null ) {
            trmAgencyRecord.setPxzsc( dto.getPxzsc() );
        }
        if ( dto.getTrmagencyrecordname() != null ) {
            trmAgencyRecord.setTrmagencyrecordname( dto.getTrmagencyrecordname() );
        }
        if ( dto.getTrmtrainagencyid() != null ) {
            trmAgencyRecord.setTrmtrainagencyid( dto.getTrmtrainagencyid() );
        }
        if ( dto.getEnable() != null ) {
            trmAgencyRecord.setEnable( dto.getEnable() );
        }
        if ( dto.getTrmagencyrecordid() != null ) {
            trmAgencyRecord.setTrmagencyrecordid( dto.getTrmagencyrecordid() );
        }
        if ( dto.getCreateman() != null ) {
            trmAgencyRecord.setCreateman( dto.getCreateman() );
        }
        if ( dto.getCreatedate() != null ) {
            trmAgencyRecord.setCreatedate( dto.getCreatedate() );
        }
        if ( dto.getUpdateman() != null ) {
            trmAgencyRecord.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getUpdatedate() != null ) {
            trmAgencyRecord.setUpdatedate( dto.getUpdatedate() );
        }
        if ( dto.getTrmtrainagencyname() != null ) {
            trmAgencyRecord.setTrmtrainagencyname( dto.getTrmtrainagencyname() );
        }

        return trmAgencyRecord;
    }

    @Override
    public TrmAgencyRecordDTO toDto(TrmAgencyRecord entity) {
        if ( entity == null ) {
            return null;
        }

        TrmAgencyRecordDTO trmAgencyRecordDTO = new TrmAgencyRecordDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            trmAgencyRecordDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            trmAgencyRecordDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getPxcs() != null ) {
            trmAgencyRecordDTO.setPxcs( entity.getPxcs() );
        }
        if ( entity.getPxzsc() != null ) {
            trmAgencyRecordDTO.setPxzsc( entity.getPxzsc() );
        }
        if ( entity.getTrmagencyrecordname() != null ) {
            trmAgencyRecordDTO.setTrmagencyrecordname( entity.getTrmagencyrecordname() );
        }
        if ( entity.getTrmtrainagencyid() != null ) {
            trmAgencyRecordDTO.setTrmtrainagencyid( entity.getTrmtrainagencyid() );
        }
        if ( entity.getEnable() != null ) {
            trmAgencyRecordDTO.setEnable( entity.getEnable() );
        }
        if ( entity.getTrmagencyrecordid() != null ) {
            trmAgencyRecordDTO.setTrmagencyrecordid( entity.getTrmagencyrecordid() );
        }
        if ( entity.getCreateman() != null ) {
            trmAgencyRecordDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getCreatedate() != null ) {
            trmAgencyRecordDTO.setCreatedate( entity.getCreatedate() );
        }
        if ( entity.getUpdateman() != null ) {
            trmAgencyRecordDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getUpdatedate() != null ) {
            trmAgencyRecordDTO.setUpdatedate( entity.getUpdatedate() );
        }
        if ( entity.getTrmtrainagencyname() != null ) {
            trmAgencyRecordDTO.setTrmtrainagencyname( entity.getTrmtrainagencyname() );
        }

        return trmAgencyRecordDTO;
    }

    @Override
    public List<TrmAgencyRecord> toDomain(List<TrmAgencyRecordDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<TrmAgencyRecord> list = new ArrayList<TrmAgencyRecord>( dtoList.size() );
        for ( TrmAgencyRecordDTO trmAgencyRecordDTO : dtoList ) {
            list.add( toDomain( trmAgencyRecordDTO ) );
        }

        return list;
    }

    @Override
    public List<TrmAgencyRecordDTO> toDto(List<TrmAgencyRecord> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<TrmAgencyRecordDTO> list = new ArrayList<TrmAgencyRecordDTO>( entityList.size() );
        for ( TrmAgencyRecord trmAgencyRecord : entityList ) {
            list.add( toDto( trmAgencyRecord ) );
        }

        return list;
    }
}
