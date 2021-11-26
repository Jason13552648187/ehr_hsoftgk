package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.sal.domain.SalScheme;
import cn.ibizlab.ehr.webapi.dto.SalSchemeDTO;
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
public class SalSchemeMappingImpl implements SalSchemeMapping {

    @Override
    public SalScheme toDomain(SalSchemeDTO dto) {
        if ( dto == null ) {
            return null;
        }

        SalScheme salScheme = new SalScheme();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            salScheme.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            salScheme.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getSaltype() != null ) {
            salScheme.setSaltype( dto.getSaltype() );
        }
        if ( dto.getMemo() != null ) {
            salScheme.setMemo( dto.getMemo() );
        }
        if ( dto.getSalschemename() != null ) {
            salScheme.setSalschemename( dto.getSalschemename() );
        }
        if ( dto.getValidflag() != null ) {
            salScheme.setValidflag( dto.getValidflag() );
        }
        if ( dto.getOrmorgid() != null ) {
            salScheme.setOrmorgid( dto.getOrmorgid() );
        }
        if ( dto.getCreatedate() != null ) {
            salScheme.setCreatedate( dto.getCreatedate() );
        }
        if ( dto.getUpdatedate() != null ) {
            salScheme.setUpdatedate( dto.getUpdatedate() );
        }
        if ( dto.getCreateman() != null ) {
            salScheme.setCreateman( dto.getCreateman() );
        }
        if ( dto.getEnable() != null ) {
            salScheme.setEnable( dto.getEnable() );
        }
        if ( dto.getUpdateman() != null ) {
            salScheme.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getSalschemeid() != null ) {
            salScheme.setSalschemeid( dto.getSalschemeid() );
        }
        if ( dto.getOrmorgname() != null ) {
            salScheme.setOrmorgname( dto.getOrmorgname() );
        }

        return salScheme;
    }

    @Override
    public SalSchemeDTO toDto(SalScheme entity) {
        if ( entity == null ) {
            return null;
        }

        SalSchemeDTO salSchemeDTO = new SalSchemeDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            salSchemeDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            salSchemeDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getSaltype() != null ) {
            salSchemeDTO.setSaltype( entity.getSaltype() );
        }
        if ( entity.getMemo() != null ) {
            salSchemeDTO.setMemo( entity.getMemo() );
        }
        if ( entity.getSalschemename() != null ) {
            salSchemeDTO.setSalschemename( entity.getSalschemename() );
        }
        if ( entity.getValidflag() != null ) {
            salSchemeDTO.setValidflag( entity.getValidflag() );
        }
        if ( entity.getOrmorgid() != null ) {
            salSchemeDTO.setOrmorgid( entity.getOrmorgid() );
        }
        if ( entity.getCreatedate() != null ) {
            salSchemeDTO.setCreatedate( entity.getCreatedate() );
        }
        if ( entity.getUpdatedate() != null ) {
            salSchemeDTO.setUpdatedate( entity.getUpdatedate() );
        }
        if ( entity.getCreateman() != null ) {
            salSchemeDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getEnable() != null ) {
            salSchemeDTO.setEnable( entity.getEnable() );
        }
        if ( entity.getUpdateman() != null ) {
            salSchemeDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getSalschemeid() != null ) {
            salSchemeDTO.setSalschemeid( entity.getSalschemeid() );
        }
        if ( entity.getOrmorgname() != null ) {
            salSchemeDTO.setOrmorgname( entity.getOrmorgname() );
        }

        return salSchemeDTO;
    }

    @Override
    public List<SalScheme> toDomain(List<SalSchemeDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<SalScheme> list = new ArrayList<SalScheme>( dtoList.size() );
        for ( SalSchemeDTO salSchemeDTO : dtoList ) {
            list.add( toDomain( salSchemeDTO ) );
        }

        return list;
    }

    @Override
    public List<SalSchemeDTO> toDto(List<SalScheme> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<SalSchemeDTO> list = new ArrayList<SalSchemeDTO>( entityList.size() );
        for ( SalScheme salScheme : entityList ) {
            list.add( toDto( salScheme ) );
        }

        return list;
    }
}
