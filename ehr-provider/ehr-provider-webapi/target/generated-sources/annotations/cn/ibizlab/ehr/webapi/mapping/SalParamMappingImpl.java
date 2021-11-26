package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.sal.domain.SalParam;
import cn.ibizlab.ehr.webapi.dto.SalParamDTO;
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
    date = "2021-09-04T00:31:46+0800",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_92 (Oracle Corporation)"
)
@Component
public class SalParamMappingImpl implements SalParamMapping {

    @Override
    public SalParam toDomain(SalParamDTO dto) {
        if ( dto == null ) {
            return null;
        }

        SalParam salParam = new SalParam();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            salParam.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            salParam.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getMemo() != null ) {
            salParam.setMemo( dto.getMemo() );
        }
        if ( dto.getParam() != null ) {
            salParam.setParam( dto.getParam() );
        }
        if ( dto.getSalparamname() != null ) {
            salParam.setSalparamname( dto.getSalparamname() );
        }
        if ( dto.getSalsourceid() != null ) {
            salParam.setSalsourceid( dto.getSalsourceid() );
        }
        if ( dto.getUpdateman() != null ) {
            salParam.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getUpdatedate() != null ) {
            salParam.setUpdatedate( dto.getUpdatedate() );
        }
        if ( dto.getCreateman() != null ) {
            salParam.setCreateman( dto.getCreateman() );
        }
        if ( dto.getEnable() != null ) {
            salParam.setEnable( dto.getEnable() );
        }
        if ( dto.getSalparamid() != null ) {
            salParam.setSalparamid( dto.getSalparamid() );
        }
        if ( dto.getCreatedate() != null ) {
            salParam.setCreatedate( dto.getCreatedate() );
        }
        if ( dto.getSalsourcename() != null ) {
            salParam.setSalsourcename( dto.getSalsourcename() );
        }

        return salParam;
    }

    @Override
    public SalParamDTO toDto(SalParam entity) {
        if ( entity == null ) {
            return null;
        }

        SalParamDTO salParamDTO = new SalParamDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            salParamDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            salParamDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getMemo() != null ) {
            salParamDTO.setMemo( entity.getMemo() );
        }
        if ( entity.getParam() != null ) {
            salParamDTO.setParam( entity.getParam() );
        }
        if ( entity.getSalparamname() != null ) {
            salParamDTO.setSalparamname( entity.getSalparamname() );
        }
        if ( entity.getSalsourceid() != null ) {
            salParamDTO.setSalsourceid( entity.getSalsourceid() );
        }
        if ( entity.getUpdateman() != null ) {
            salParamDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getUpdatedate() != null ) {
            salParamDTO.setUpdatedate( entity.getUpdatedate() );
        }
        if ( entity.getCreateman() != null ) {
            salParamDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getEnable() != null ) {
            salParamDTO.setEnable( entity.getEnable() );
        }
        if ( entity.getSalparamid() != null ) {
            salParamDTO.setSalparamid( entity.getSalparamid() );
        }
        if ( entity.getCreatedate() != null ) {
            salParamDTO.setCreatedate( entity.getCreatedate() );
        }
        if ( entity.getSalsourcename() != null ) {
            salParamDTO.setSalsourcename( entity.getSalsourcename() );
        }

        return salParamDTO;
    }

    @Override
    public List<SalParam> toDomain(List<SalParamDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<SalParam> list = new ArrayList<SalParam>( dtoList.size() );
        for ( SalParamDTO salParamDTO : dtoList ) {
            list.add( toDomain( salParamDTO ) );
        }

        return list;
    }

    @Override
    public List<SalParamDTO> toDto(List<SalParam> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<SalParamDTO> list = new ArrayList<SalParamDTO>( entityList.size() );
        for ( SalParam salParam : entityList ) {
            list.add( toDto( salParam ) );
        }

        return list;
    }
}
