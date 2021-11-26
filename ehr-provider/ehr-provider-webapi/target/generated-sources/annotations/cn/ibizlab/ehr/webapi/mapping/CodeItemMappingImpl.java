package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.common.domain.CodeItem;
import cn.ibizlab.ehr.webapi.dto.CodeItemDTO;
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
public class CodeItemMappingImpl implements CodeItemMapping {

    @Override
    public CodeItem toDomain(CodeItemDTO dto) {
        if ( dto == null ) {
            return null;
        }

        CodeItem codeItem = new CodeItem();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            codeItem.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            codeItem.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getShortkey() != null ) {
            codeItem.setShortkey( dto.getShortkey() );
        }
        if ( dto.getCodeitemname() != null ) {
            codeItem.setCodeitemname( dto.getCodeitemname() );
        }
        if ( dto.getMemo() != null ) {
            codeItem.setMemo( dto.getMemo() );
        }
        if ( dto.getCodeitemvalue() != null ) {
            codeItem.setCodeitemvalue( dto.getCodeitemvalue() );
        }
        if ( dto.getPcodeitemid() != null ) {
            codeItem.setPcodeitemid( dto.getPcodeitemid() );
        }
        if ( dto.getCodelistid() != null ) {
            codeItem.setCodelistid( dto.getCodelistid() );
        }
        if ( dto.getOrdervalue() != null ) {
            codeItem.setOrdervalue( dto.getOrdervalue() );
        }
        if ( dto.getCreateman() != null ) {
            codeItem.setCreateman( dto.getCreateman() );
        }
        if ( dto.getUpdateman() != null ) {
            codeItem.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getCodeitemid() != null ) {
            codeItem.setCodeitemid( dto.getCodeitemid() );
        }
        if ( dto.getCreatedate() != null ) {
            codeItem.setCreatedate( dto.getCreatedate() );
        }
        if ( dto.getUpdatedate() != null ) {
            codeItem.setUpdatedate( dto.getUpdatedate() );
        }
        if ( dto.getCodelistname() != null ) {
            codeItem.setCodelistname( dto.getCodelistname() );
        }
        if ( dto.getPcodeitemname() != null ) {
            codeItem.setPcodeitemname( dto.getPcodeitemname() );
        }

        return codeItem;
    }

    @Override
    public CodeItemDTO toDto(CodeItem entity) {
        if ( entity == null ) {
            return null;
        }

        CodeItemDTO codeItemDTO = new CodeItemDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            codeItemDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            codeItemDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getShortkey() != null ) {
            codeItemDTO.setShortkey( entity.getShortkey() );
        }
        if ( entity.getCodeitemname() != null ) {
            codeItemDTO.setCodeitemname( entity.getCodeitemname() );
        }
        if ( entity.getMemo() != null ) {
            codeItemDTO.setMemo( entity.getMemo() );
        }
        if ( entity.getCodeitemvalue() != null ) {
            codeItemDTO.setCodeitemvalue( entity.getCodeitemvalue() );
        }
        if ( entity.getPcodeitemid() != null ) {
            codeItemDTO.setPcodeitemid( entity.getPcodeitemid() );
        }
        if ( entity.getCodelistid() != null ) {
            codeItemDTO.setCodelistid( entity.getCodelistid() );
        }
        if ( entity.getOrdervalue() != null ) {
            codeItemDTO.setOrdervalue( entity.getOrdervalue() );
        }
        if ( entity.getCreateman() != null ) {
            codeItemDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getUpdateman() != null ) {
            codeItemDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getCodeitemid() != null ) {
            codeItemDTO.setCodeitemid( entity.getCodeitemid() );
        }
        if ( entity.getCreatedate() != null ) {
            codeItemDTO.setCreatedate( entity.getCreatedate() );
        }
        if ( entity.getUpdatedate() != null ) {
            codeItemDTO.setUpdatedate( entity.getUpdatedate() );
        }
        if ( entity.getCodelistname() != null ) {
            codeItemDTO.setCodelistname( entity.getCodelistname() );
        }
        if ( entity.getPcodeitemname() != null ) {
            codeItemDTO.setPcodeitemname( entity.getPcodeitemname() );
        }

        return codeItemDTO;
    }

    @Override
    public List<CodeItem> toDomain(List<CodeItemDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<CodeItem> list = new ArrayList<CodeItem>( dtoList.size() );
        for ( CodeItemDTO codeItemDTO : dtoList ) {
            list.add( toDomain( codeItemDTO ) );
        }

        return list;
    }

    @Override
    public List<CodeItemDTO> toDto(List<CodeItem> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<CodeItemDTO> list = new ArrayList<CodeItemDTO>( entityList.size() );
        for ( CodeItem codeItem : entityList ) {
            list.add( toDto( codeItem ) );
        }

        return list;
    }
}
