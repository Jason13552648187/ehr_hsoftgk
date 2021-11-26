package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.pim.domain.PimArchivesCenter;
import cn.ibizlab.ehr.webapi.dto.PimArchivesCenterDTO;
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
public class PimArchivesCenterMappingImpl implements PimArchivesCenterMapping {

    @Override
    public PimArchivesCenter toDomain(PimArchivesCenterDTO dto) {
        if ( dto == null ) {
            return null;
        }

        PimArchivesCenter pimArchivesCenter = new PimArchivesCenter();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            pimArchivesCenter.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            pimArchivesCenter.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getCabinetno() != null ) {
            pimArchivesCenter.setCabinetno( dto.getCabinetno() );
        }
        if ( dto.getBnumber() != null ) {
            pimArchivesCenter.setBnumber( dto.getBnumber() );
        }
        if ( dto.getSerialno() != null ) {
            pimArchivesCenter.setSerialno( dto.getSerialno() );
        }
        if ( dto.getMemo() != null ) {
            pimArchivesCenter.setMemo( dto.getMemo() );
        }
        if ( dto.getArchivescentername() != null ) {
            pimArchivesCenter.setArchivescentername( dto.getArchivescentername() );
        }
        if ( dto.getLayerno() != null ) {
            pimArchivesCenter.setLayerno( dto.getLayerno() );
        }
        if ( dto.getOrmorgid() != null ) {
            pimArchivesCenter.setOrmorgid( dto.getOrmorgid() );
        }
        if ( dto.getCreateman() != null ) {
            pimArchivesCenter.setCreateman( dto.getCreateman() );
        }
        if ( dto.getCreatedate() != null ) {
            pimArchivesCenter.setCreatedate( dto.getCreatedate() );
        }
        if ( dto.getUpdatedate() != null ) {
            pimArchivesCenter.setUpdatedate( dto.getUpdatedate() );
        }
        if ( dto.getPosition() != null ) {
            pimArchivesCenter.setPosition( dto.getPosition() );
        }
        if ( dto.getArchivescenterid() != null ) {
            pimArchivesCenter.setArchivescenterid( dto.getArchivescenterid() );
        }
        if ( dto.getUpdateman() != null ) {
            pimArchivesCenter.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getOrgid() != null ) {
            pimArchivesCenter.setOrgid( dto.getOrgid() );
        }
        if ( dto.getEnable() != null ) {
            pimArchivesCenter.setEnable( dto.getEnable() );
        }
        if ( dto.getOrmorgname() != null ) {
            pimArchivesCenter.setOrmorgname( dto.getOrmorgname() );
        }

        return pimArchivesCenter;
    }

    @Override
    public PimArchivesCenterDTO toDto(PimArchivesCenter entity) {
        if ( entity == null ) {
            return null;
        }

        PimArchivesCenterDTO pimArchivesCenterDTO = new PimArchivesCenterDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            pimArchivesCenterDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            pimArchivesCenterDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getCabinetno() != null ) {
            pimArchivesCenterDTO.setCabinetno( entity.getCabinetno() );
        }
        if ( entity.getBnumber() != null ) {
            pimArchivesCenterDTO.setBnumber( entity.getBnumber() );
        }
        if ( entity.getSerialno() != null ) {
            pimArchivesCenterDTO.setSerialno( entity.getSerialno() );
        }
        if ( entity.getMemo() != null ) {
            pimArchivesCenterDTO.setMemo( entity.getMemo() );
        }
        if ( entity.getArchivescentername() != null ) {
            pimArchivesCenterDTO.setArchivescentername( entity.getArchivescentername() );
        }
        if ( entity.getLayerno() != null ) {
            pimArchivesCenterDTO.setLayerno( entity.getLayerno() );
        }
        if ( entity.getOrmorgid() != null ) {
            pimArchivesCenterDTO.setOrmorgid( entity.getOrmorgid() );
        }
        if ( entity.getCreateman() != null ) {
            pimArchivesCenterDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getCreatedate() != null ) {
            pimArchivesCenterDTO.setCreatedate( entity.getCreatedate() );
        }
        if ( entity.getUpdatedate() != null ) {
            pimArchivesCenterDTO.setUpdatedate( entity.getUpdatedate() );
        }
        if ( entity.getPosition() != null ) {
            pimArchivesCenterDTO.setPosition( entity.getPosition() );
        }
        if ( entity.getArchivescenterid() != null ) {
            pimArchivesCenterDTO.setArchivescenterid( entity.getArchivescenterid() );
        }
        if ( entity.getUpdateman() != null ) {
            pimArchivesCenterDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getOrgid() != null ) {
            pimArchivesCenterDTO.setOrgid( entity.getOrgid() );
        }
        if ( entity.getEnable() != null ) {
            pimArchivesCenterDTO.setEnable( entity.getEnable() );
        }
        if ( entity.getOrmorgname() != null ) {
            pimArchivesCenterDTO.setOrmorgname( entity.getOrmorgname() );
        }

        return pimArchivesCenterDTO;
    }

    @Override
    public List<PimArchivesCenter> toDomain(List<PimArchivesCenterDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<PimArchivesCenter> list = new ArrayList<PimArchivesCenter>( dtoList.size() );
        for ( PimArchivesCenterDTO pimArchivesCenterDTO : dtoList ) {
            list.add( toDomain( pimArchivesCenterDTO ) );
        }

        return list;
    }

    @Override
    public List<PimArchivesCenterDTO> toDto(List<PimArchivesCenter> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<PimArchivesCenterDTO> list = new ArrayList<PimArchivesCenterDTO>( entityList.size() );
        for ( PimArchivesCenter pimArchivesCenter : entityList ) {
            list.add( toDto( pimArchivesCenter ) );
        }

        return list;
    }
}
