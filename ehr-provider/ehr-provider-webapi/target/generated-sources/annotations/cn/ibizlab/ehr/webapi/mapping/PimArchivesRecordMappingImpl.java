package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.pim.domain.PimArchivesRecord;
import cn.ibizlab.ehr.webapi.dto.PimArchivesRecordDTO;
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
    date = "2021-09-04T00:31:48+0800",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_92 (Oracle Corporation)"
)
@Component
public class PimArchivesRecordMappingImpl implements PimArchivesRecordMapping {

    @Override
    public PimArchivesRecord toDomain(PimArchivesRecordDTO dto) {
        if ( dto == null ) {
            return null;
        }

        PimArchivesRecord pimArchivesRecord = new PimArchivesRecord();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            pimArchivesRecord.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            pimArchivesRecord.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getPimarchivesrecordname() != null ) {
            pimArchivesRecord.setPimarchivesrecordname( dto.getPimarchivesrecordname() );
        }
        if ( dto.getMemo() != null ) {
            pimArchivesRecord.setMemo( dto.getMemo() );
        }
        if ( dto.getArchivalcatalogueid() != null ) {
            pimArchivesRecord.setArchivalcatalogueid( dto.getArchivalcatalogueid() );
        }
        if ( dto.getPimarchivesid() != null ) {
            pimArchivesRecord.setPimarchivesid( dto.getPimarchivesid() );
        }
        if ( dto.getEnable() != null ) {
            pimArchivesRecord.setEnable( dto.getEnable() );
        }
        if ( dto.getUpdatedate() != null ) {
            pimArchivesRecord.setUpdatedate( dto.getUpdatedate() );
        }
        if ( dto.getCreateman() != null ) {
            pimArchivesRecord.setCreateman( dto.getCreateman() );
        }
        if ( dto.getPimarchivesrecordid() != null ) {
            pimArchivesRecord.setPimarchivesrecordid( dto.getPimarchivesrecordid() );
        }
        if ( dto.getCreatedate() != null ) {
            pimArchivesRecord.setCreatedate( dto.getCreatedate() );
        }
        if ( dto.getUpdateman() != null ) {
            pimArchivesRecord.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getPimarchivesname() != null ) {
            pimArchivesRecord.setPimarchivesname( dto.getPimarchivesname() );
        }
        if ( dto.getSerialnumber() != null ) {
            pimArchivesRecord.setSerialnumber( dto.getSerialnumber() );
        }
        if ( dto.getArchivalcataloguename() != null ) {
            pimArchivesRecord.setArchivalcataloguename( dto.getArchivalcataloguename() );
        }

        return pimArchivesRecord;
    }

    @Override
    public PimArchivesRecordDTO toDto(PimArchivesRecord entity) {
        if ( entity == null ) {
            return null;
        }

        PimArchivesRecordDTO pimArchivesRecordDTO = new PimArchivesRecordDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            pimArchivesRecordDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            pimArchivesRecordDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getPimarchivesrecordname() != null ) {
            pimArchivesRecordDTO.setPimarchivesrecordname( entity.getPimarchivesrecordname() );
        }
        if ( entity.getMemo() != null ) {
            pimArchivesRecordDTO.setMemo( entity.getMemo() );
        }
        if ( entity.getArchivalcatalogueid() != null ) {
            pimArchivesRecordDTO.setArchivalcatalogueid( entity.getArchivalcatalogueid() );
        }
        if ( entity.getPimarchivesid() != null ) {
            pimArchivesRecordDTO.setPimarchivesid( entity.getPimarchivesid() );
        }
        if ( entity.getEnable() != null ) {
            pimArchivesRecordDTO.setEnable( entity.getEnable() );
        }
        if ( entity.getUpdatedate() != null ) {
            pimArchivesRecordDTO.setUpdatedate( entity.getUpdatedate() );
        }
        if ( entity.getCreateman() != null ) {
            pimArchivesRecordDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getPimarchivesrecordid() != null ) {
            pimArchivesRecordDTO.setPimarchivesrecordid( entity.getPimarchivesrecordid() );
        }
        if ( entity.getCreatedate() != null ) {
            pimArchivesRecordDTO.setCreatedate( entity.getCreatedate() );
        }
        if ( entity.getUpdateman() != null ) {
            pimArchivesRecordDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getPimarchivesname() != null ) {
            pimArchivesRecordDTO.setPimarchivesname( entity.getPimarchivesname() );
        }
        if ( entity.getSerialnumber() != null ) {
            pimArchivesRecordDTO.setSerialnumber( entity.getSerialnumber() );
        }
        if ( entity.getArchivalcataloguename() != null ) {
            pimArchivesRecordDTO.setArchivalcataloguename( entity.getArchivalcataloguename() );
        }

        return pimArchivesRecordDTO;
    }

    @Override
    public List<PimArchivesRecord> toDomain(List<PimArchivesRecordDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<PimArchivesRecord> list = new ArrayList<PimArchivesRecord>( dtoList.size() );
        for ( PimArchivesRecordDTO pimArchivesRecordDTO : dtoList ) {
            list.add( toDomain( pimArchivesRecordDTO ) );
        }

        return list;
    }

    @Override
    public List<PimArchivesRecordDTO> toDto(List<PimArchivesRecord> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<PimArchivesRecordDTO> list = new ArrayList<PimArchivesRecordDTO>( entityList.size() );
        for ( PimArchivesRecord pimArchivesRecord : entityList ) {
            list.add( toDto( pimArchivesRecord ) );
        }

        return list;
    }
}
