package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.sal.domain.SalStdzj;
import cn.ibizlab.ehr.webapi.dto.SalStdzjDTO;
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
    date = "2021-09-04T00:31:45+0800",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_92 (Oracle Corporation)"
)
@Component
public class SalStdzjMappingImpl implements SalStdzjMapping {

    @Override
    public SalStdzj toDomain(SalStdzjDTO dto) {
        if ( dto == null ) {
            return null;
        }

        SalStdzj salStdzj = new SalStdzj();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            salStdzj.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            salStdzj.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getZj() != null ) {
            salStdzj.setZj( dto.getZj() );
        }
        if ( dto.getBz() != null ) {
            salStdzj.setBz( dto.getBz() );
        }
        if ( dto.getSalstdzjname() != null ) {
            salStdzj.setSalstdzjname( dto.getSalstdzjname() );
        }
        if ( dto.getOrmorgid() != null ) {
            salStdzj.setOrmorgid( dto.getOrmorgid() );
        }
        if ( dto.getUpdatedate() != null ) {
            salStdzj.setUpdatedate( dto.getUpdatedate() );
        }
        if ( dto.getCreatedate() != null ) {
            salStdzj.setCreatedate( dto.getCreatedate() );
        }
        if ( dto.getCreateman() != null ) {
            salStdzj.setCreateman( dto.getCreateman() );
        }
        if ( dto.getEnable() != null ) {
            salStdzj.setEnable( dto.getEnable() );
        }
        if ( dto.getUpdateman() != null ) {
            salStdzj.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getSalstdzjid() != null ) {
            salStdzj.setSalstdzjid( dto.getSalstdzjid() );
        }
        if ( dto.getOrmorgname() != null ) {
            salStdzj.setOrmorgname( dto.getOrmorgname() );
        }

        return salStdzj;
    }

    @Override
    public SalStdzjDTO toDto(SalStdzj entity) {
        if ( entity == null ) {
            return null;
        }

        SalStdzjDTO salStdzjDTO = new SalStdzjDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            salStdzjDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            salStdzjDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getZj() != null ) {
            salStdzjDTO.setZj( entity.getZj() );
        }
        if ( entity.getBz() != null ) {
            salStdzjDTO.setBz( entity.getBz() );
        }
        if ( entity.getSalstdzjname() != null ) {
            salStdzjDTO.setSalstdzjname( entity.getSalstdzjname() );
        }
        if ( entity.getOrmorgid() != null ) {
            salStdzjDTO.setOrmorgid( entity.getOrmorgid() );
        }
        if ( entity.getUpdatedate() != null ) {
            salStdzjDTO.setUpdatedate( entity.getUpdatedate() );
        }
        if ( entity.getCreatedate() != null ) {
            salStdzjDTO.setCreatedate( entity.getCreatedate() );
        }
        if ( entity.getCreateman() != null ) {
            salStdzjDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getEnable() != null ) {
            salStdzjDTO.setEnable( entity.getEnable() );
        }
        if ( entity.getUpdateman() != null ) {
            salStdzjDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getSalstdzjid() != null ) {
            salStdzjDTO.setSalstdzjid( entity.getSalstdzjid() );
        }
        if ( entity.getOrmorgname() != null ) {
            salStdzjDTO.setOrmorgname( entity.getOrmorgname() );
        }

        return salStdzjDTO;
    }

    @Override
    public List<SalStdzj> toDomain(List<SalStdzjDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<SalStdzj> list = new ArrayList<SalStdzj>( dtoList.size() );
        for ( SalStdzjDTO salStdzjDTO : dtoList ) {
            list.add( toDomain( salStdzjDTO ) );
        }

        return list;
    }

    @Override
    public List<SalStdzjDTO> toDto(List<SalStdzj> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<SalStdzjDTO> list = new ArrayList<SalStdzjDTO>( entityList.size() );
        for ( SalStdzj salStdzj : entityList ) {
            list.add( toDto( salStdzj ) );
        }

        return list;
    }
}
